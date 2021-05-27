package com.amalitech.org.Entity;

import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class TraineeTrack {
	@EmbeddedId
private TraineetrackId traineeTrackId;
	
	public TraineeTrack(Trainee trainee, Track track) {	
		super();
		this.traineeTrackId = new TraineetrackId(trainee.getId(), track.getId());
		this.trainee = trainee;
		this.track = track;
	}

	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("traineeId")
	@JoinColumn(name = "trainee_id")
	private Trainee trainee;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("trackId")
	@JoinColumn(name = "track_id")
	private Track track;
	
	@CreationTimestamp
	private LocalDateTime joinedDate;
	
    }


