package com.amalitech.org.Entity;
import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amalitech.org.enums.BatchStatus;

public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private LocalDate startingDate;
private LocalDate endingDate;
private BatchStatus batchStatus = BatchStatus.inactivated;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getStartingDate() {
	return startingDate;
}
public void setStartingDate(LocalDate startingDate) {
	this.startingDate = startingDate;
}
public LocalDate getEndingDate() {
	return endingDate;
}
public void setEndingDate(LocalDate endingDate) {
	this.endingDate = endingDate;
}
public BatchStatus getBatchStatus() {
	return batchStatus;
}
public void setBatchStatus(BatchStatus batchStatus) {
	this.batchStatus = batchStatus;
}

}
