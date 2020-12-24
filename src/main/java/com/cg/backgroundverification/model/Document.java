package com.cg.backgroundverification.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity(name = "DOCUMENT")
public class Document {

	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "DOCUMENT_ID")
	private Integer docId;
	
	@Lob @Column(name = "DOCUMENT_FILE")
	private byte[] docFile;
	
	@OneToOne @JoinColumn(name = "REQUEST_ID", nullable = false)
	private VerificationDetails verificationDetails;
	
	@OneToOne @JoinColumn(name = "EMPLOYEE_ID", nullable = false)
	private Login login;
	
	@OneToOne @JoinColumn(name = "DOCUMENT_TYPE_ID", nullable = false)
	private DocumentMaster documentMaster;

	public Document() {
		super();
	}

	public Document(Integer docId, byte[] docFile, VerificationDetails verificationDetails, Login login,
			DocumentMaster documentMaster) {
		super();
		this.docId = docId;
		this.docFile = docFile;
		this.verificationDetails = verificationDetails;
		this.login = login;
		this.documentMaster = documentMaster;
	}

	public Integer getDocId() {
		return docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	public byte[] getDocFile() {
		return docFile;
	}

	public void setDocFile(byte[] docFile) {
		this.docFile = docFile;
	}

	public VerificationDetails getVerificationDetails() {
		return verificationDetails;
	}

	public void setVerificationDetails(VerificationDetails verificationDetails) {
		this.verificationDetails = verificationDetails;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public DocumentMaster getDocumentMaster() {
		return documentMaster;
	}

	public void setDocumentMaster(DocumentMaster documentMaster) {
		this.documentMaster = documentMaster;
	}
}
