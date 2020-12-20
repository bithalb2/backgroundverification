package com.cg.backgroundverification.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity(name = "DOCUMENT")
@Data
public class Document {

	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "DOCUMENT_ID")
	private Integer docId;
	
	@Column(name = "DOCUMENT_FILE")
	private Blob docFile;
	
	@OneToOne @JoinColumn(name = "REQUEST_ID", nullable = false)
	private VerificationDetails verificationDetails;
	
	@OneToOne @JoinColumn(name = "EMPLOYEE_ID", nullable = false)
	private Login login;
	
	@OneToOne @JoinColumn(name = "DOCUMENT_TYPE_ID", nullable = false)
	private DocumentMaster documentMaster;
}
