package com.amalitech.org.Entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TraineetrackId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8496786270457635053L;
	private int track_id;
	private int trainee_id;
	public TraineetrackId(int track_id, int trainee_id) {
		super();
		this.track_id = track_id;
		this.trainee_id = trainee_id;
	}
	public TraineetrackId() {
		super();
	}
	public int getTrack_id() {
		return track_id;
	}
	public void setTrack_id(int track_id) {
		this.track_id = track_id;
	}
	public int getTrainee_id() {
		return trainee_id;
	}
	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}
	

}
