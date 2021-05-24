package com.amalitech.org.Entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Track {
	
	private int id;
	private String trackName;
	private String trackCode;
	private Boolean isActivated = true;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public String getTrackCode() {
		return trackCode;
	}
	public void setTrackCode(String trackCode) {
		this.trackCode = trackCode;
	}
	public Boolean getIsActivated() {
		return isActivated;
	}
	public void setIsActivated(Boolean isActivated) {
		this.isActivated = isActivated;
	}
	
	

}
