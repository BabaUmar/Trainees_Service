package com.amalitech.org.dto;

import java.util.List;
import com.amalitech.org.Entity.Trainee;
import lombok.Data;
@Data
public class TrackDTO {
	private Integer id;
	private String name;
	private String code;
	private List<Trainee> trainees;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<Trainee> getTrainees() {
		return trainees;
	}
	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}
	

}
