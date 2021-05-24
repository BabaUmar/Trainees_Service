package com.amalitech.org.enums;

public enum TraineeStatus {
created("CREATED"), activated("ACTIVATED"), suspended("SUSPENDED"), completed("COMPLETED");
	
	private String traineeStatus;
	
	private TraineeStatus(String traineeStatus) {
		this.setTraineeStatus(traineeStatus);
	}

	public String getTraineeStatus() {
		return traineeStatus;
	}

	public void setTraineeStatus(String traineeStatus) {
		this.traineeStatus = traineeStatus;
	}

}
