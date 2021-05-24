package com.amalitech.org.dto;

import java.time.LocalDate;

import com.amalitech.org.enums.BatchStatus;

import lombok.Data;
@Data
public class BatchDTO {
	private String name;
	private BatchStatus batchStatus = BatchStatus.inactivated;
	private LocalDate beginningDate;
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
		return beginningDate;
	}
	public void setBeginningDate(LocalDate beginningDate) {
		this.beginningDate = beginningDate;
	}
	public LocalDate getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(LocalDate endingDate) {
		this.endingDate = endingDate;
	}

}
