package com.cg.backgroundverification.dto;

import java.sql.Date;

public class VerificationDto {

	private Integer varId;
	private Date startDate;
	private Date endDate;
	private String status;
	
	public VerificationDto() {
		super();
	}

	public VerificationDto(Integer varId, Date startDate, Date endDate, String status) {
		super();
		this.varId = varId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	public Integer getVarId() {
		return varId;
	}

	public void setVarId(Integer varId) {
		this.varId = varId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
