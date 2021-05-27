package com.amalitech.org.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amalitech.org.Entity.Track;
import com.amalitech.org.Entity.Trainee;
import com.amalitech.org.Entity.TraineeTrack;
//import com.amalitech.org.Entity.Trainee;
//import com.amalitech.org.Entity.Trainee;
import com.amalitech.org.Repository.TrackRepository;
import com.amalitech.org.Repository.TraineeRepository;
//import com.amalitech.org.Repository.TraineeRepository;
//import com.amalitech.org.Repository.TraineeRepository;
import com.amalitech.org.Repository.TraineeTrackRepository;



@Service
public class TrackService {
	@Autowired
	private TrackRepository trackRepository;
	@Autowired
	private TraineeTrackRepository ttRepository;
	@Autowired
	private TraineeRepository traineeRepository;
	


	
	public Track createTrack(Track track) {
		return trackRepository.save(track);
		
	}
	public List<Track> getTracks() {
		return (List<Track>) trackRepository.findAll();
	}
	
	public void deleteTrack(int id) {
		trackRepository.deleteById(id);
	}
	public Track getTrack(int id) {
		return trackRepository.findById(id).orElseThrow();
	}
	public Track updateTrack(int id, Track track) {
		Track trackFound = trackRepository.findById(id).orElseThrow();
		return trackRepository.save(trackFound);
	}
	public void enrollTraineeOnTrack(Integer traineeId, Integer trackId) {
		Trainee trainee = traineeRepository.findById(traineeId).get();
		Track track = trackRepository.findById(trackId).get();
		TraineeTrack tt = new TraineeTrack(trainee, track);
		ttRepository.save(tt);
	}
	
}
	
