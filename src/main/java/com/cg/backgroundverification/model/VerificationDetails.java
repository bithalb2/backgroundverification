package com.cg.backgroundverification.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "VERIFICATION_DETAILS")
public class VerificationDetails {

	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "REQUEST_ID")
	private Integer requestId;
	
	@Column(name = "REQUEST_START_DATE")
	private Date requestStartDate;
	
	@Column(name = "REQUEST_END_DATE")
	private Date requestEndDate;
	
	@Column(name = "REQUEST_STATUS")
	private String requestStatus;

	public VerificationDetails() {
		super();
	}

	public VerificationDetails(Integer requestId, Date requestStartDate, Date requestEndDate, String requestStatus) {
		super();
		this.requestId = requestId;
		this.requestStartDate = requestStartDate;
		this.requestEndDate = requestEndDate;
		this.requestStatus = requestStatus;
	}

	public Integer getRequestId() {
		return requestId;
	}

	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}

	public Date getRequestStartDate() {
		return requestStartDate;
	}

	public void setRequestStartDate(Date requestStartDate) {
		this.requestStartDate = requestStartDate;
	}

	public Date getRequestEndDate() {
		return requestEndDate;
	}

	public void setRequestEndDate(Date requestEndDate) {
		this.requestEndDate = requestEndDate;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
}
