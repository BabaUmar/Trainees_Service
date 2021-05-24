package com.amalitech.org.enums;

public enum  BatchStatus {
	inactivated("INACTIVATED"), activated("ACTIVATED"), completed("COMPLETED");

	private String batchStatus;

	private BatchStatus(String batchStatus) {
		this.setBatchStatus(batchStatus);
	}

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

}
