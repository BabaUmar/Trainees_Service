package com.amalitech.org.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amalitech.org.Entity.Batch;
import com.amalitech.org.Entity.Track;
import com.amalitech.org.Entity.Trainee;
import com.amalitech.org.Repository.TraineeTrackRepository;
import com.amalitech.org.Service.TrackService;
import com.amalitech.org.Service.TraineeService;
import com.amalitech.org.dto.TrackDTO;

@RestController
@RequestMapping("/api")
public class TrackController {
	@Autowired
	private TrackService trackService;

	@Autowired
	private TraineeTrackRepository traineeTrackRepository;
	
	@Autowired
	private TraineeService traineeService;

	@Autowired
	private ModelMapper modelmapper;
//	@Autowired
//	private TraineeService traineeService;

	@GetMapping("/tracks")
	public List<Track> getTracks() {
		return trackService.getTracks();
	}
	@PostMapping("/track")
	public TrackDTO createTrack(@RequestBody TrackDTO trackDTO){
		Track track = modelmapper.map(trackDTO,Track.class);
		Track newTrack = trackService.createTrack(track);
		return modelmapper.map(newTrack, TrackDTO.class);
	}
	@GetMapping("/track/{id}")
	public TrackDTO getTraineeById(@PathVariable int id) {
		Track track = trackService.getTrack(id);
		List<Integer> traineeIds = new ArrayList<>();
		traineeIds.addAll(traineeTrackRepository.getTraineeWithTracks(id));
		List<Trainee> trainees = traineeIds.stream().map(x -> traineeService.getTraineeById(x))
				.collect(Collectors.toList());

		TrackDTO trackDTO = modelmapper.map(track, TrackDTO.class);
		trackDTO.setTrainees(trainees);
		return trackDTO;
	}
	@PutMapping("/track/{id}")
	public Track updateTrack(@PathVariable(name = "id") Integer id, @RequestBody TrackDTO trackDTO) {
		Track track = modelmapper.map(trackDTO, Track.class);
		return trackService.updateTrack(id, track);

	}

	@DeleteMapping("/track/{id}")
	public void deleteTrack(@PathVariable(name = "id") Integer id) {
		trackService.deleteTrack(id);
	}

	@PutMapping("/track/{trackId}/trainee/{traineeId}")
	public void enrollTraineeToTrack(@PathVariable Integer trackId, @PathVariable Integer traineeId) {
		trackService.enrollTraineeOnTrack(trackId, traineeId);
	}
	
		
//	@PostMapping("/createTrack")
//	public Track createTrack( @RequestBody TrackDTO trackDto) {
//		System.out.println(trackDto.getName(), trackDto.getId());
//		
//	}
//		return trackRepository.createTrack(track);


}
