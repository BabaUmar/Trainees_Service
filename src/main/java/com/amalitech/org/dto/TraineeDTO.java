package com.amalitech.org.dto;

import java.time.LocalDate;
import java.util.List;

import com.amalitech.org.Entity.Batch;
import com.amalitech.org.Entity.Track;
import com.amalitech.org.enums.TraineeStatus;

import lombok.Data;

@Data
public class TraineeDTO {
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private List<Track> tracks;
	private Batch batch;
	private TraineeStatus status = TraineeStatus.created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	public TraineeStatus getStatus() {
		return status;
	}
	public void setStatus(TraineeStatus status) {
		this.status = status;
	}

}
