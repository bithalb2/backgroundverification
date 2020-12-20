package com.cg.backgroundverification.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "VERIFICATION_DETAILS")
@Data
public class VerificationDetails {

	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "REQUEST_ID")
	private Integer requestId;
	
	@Column(name = "REQUEST_START_DATE")
	private Date requestStartDate;
	
	@Column(name = "REQUEST_END_DATE")
	private Date requestEndDate;
	
	@Column(name = "REQUEST_STATUS")
	private String requestStatus;
}
