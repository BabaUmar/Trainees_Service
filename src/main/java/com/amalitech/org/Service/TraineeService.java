package com.amalitech.org.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.amalitech.org.Entity.Trainee;
import com.amalitech.org.Repository.TraineeRepository;


@Service
public class TraineeService {
	@Autowired
	private TraineeRepository traineeRepository;
	

	public List<Trainee> getTrainees() {
		return traineeRepository.findAll();
	}
	public Trainee createTrainee(Trainee trainee) {
		return traineeRepository.save(trainee);
	}
	public Trainee updateTrainee(Integer id, Trainee trainee) {
		Trainee traineeFound = traineeRepository.findById(id).orElseThrow();
		trainee.setId(id);
		return traineeRepository.save(traineeFound);
	}
	
	public void deleteTrainee(Integer id) {
		traineeRepository.deleteById(id);
	}
	public Trainee getTraineeById(int id) {
		return traineeRepository.findById(id).orElseThrow();
	}
	public List<Trainee> getAllTraineesByBatchId(int id) {
		List<Trainee> batchTrainee = new ArrayList<Trainee>();
		List<Trainee> trainees = traineeRepository.findAll();
		for (Trainee trainee : trainees) {
			if (trainee.getBatch().getId() == id) {
				batchTrainee.add(trainee);
			}
		}

		return (List<Trainee>) batchTrainee;
	
}
	public List<Trainee> getAllTraineesByStatus(String status) {
		List<Trainee> statusTrainee = new ArrayList<Trainee>();
		List<Trainee> trainees = traineeRepository.findAll();
		for (Trainee trainee : trainees) {
			System.out.println(trainee.getStatus());
			System.out.println(status);
			if (trainee.getStatus().toString().compareTo(status) == 0) {
				statusTrainee.add(trainee);
			}
		}

		return (List<Trainee>) statusTrainee;
	}

}
	