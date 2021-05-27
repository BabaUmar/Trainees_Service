package com.amalitech.org.dto;

import java.time.LocalDate;

import com.amalitech.org.enums.BatchStatus;

import lombok.Data;
@Data
public class BatchDTO {
	private Integer id;
	private String name;
	private BatchStatus batchStatus = BatchStatus.inactivated;
	private LocalDate startingDate;
	private LocalDate endingDate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BatchStatus getBatchStatus() {
		return batchStatus;
	}
	public void setBatchStatus(BatchStatus batchStatus) {
		this.batchStatus = batchStatus;
	}
	public LocalDate getBeginningDate() {
		return startingDate;
	}
	public void setBeginningDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}
	public LocalDate getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(LocalDate endingDate) {
		this.endingDate = endingDate;
	}

}
