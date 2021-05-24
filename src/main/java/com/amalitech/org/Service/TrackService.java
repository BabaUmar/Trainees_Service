package com.amalitech.org.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amalitech.org.Entity.Track;
import com.amalitech.org.Entity.Trainee;
import com.amalitech.org.Repository.TrackRepository;
import com.amalitech.org.Repository.TraineeRepository;



@Service
public class TrackService {
	@Autowired
	private TrackRepository trackRepository;

	@Autowired
	private TraineeRepository traineeRepository;
	
	public Track createTrack(Track track) {
		return trackRepository.save(track);
		
	}
	public List<Track> getTracks() {
		return (List<Track>) trackRepository.findAll();
	}
	public void deleteTrack(Integer id) {
		trackRepository.deleteById(id);
	}
	public Track getTrack(Integer id) {
		return trackRepository.findById(id).orElseThrow();
	}
	public Track updateTrack(Integer id, Track track) {
		Track trackFound = trackRepository.findById(id).orElseThrow();
		return trackRepository.save(trackFound);
	}
	public void enrollTraineeToTrack(Integer trackId, Integer traineeId) {
		Track track = trackRepository.findById(trackId).orElseThrow();
		
		Trainee trainee = traineeRepository.findById(traineeId)
				.orElseThrow();

}
}
