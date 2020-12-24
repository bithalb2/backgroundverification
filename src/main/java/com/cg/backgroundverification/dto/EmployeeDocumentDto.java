package com.cg.backgroundverification.dto;

public class EmployeeDocumentDto {

	private Integer empId;
	private String empName;
	private Integer docId;
	private String docType;
	private VerificationDto verificationDto;
	
	public EmployeeDocumentDto() {
		super();
	}

	public EmployeeDocumentDto(Integer empId, String empName, Integer docId, String docType,
			VerificationDto verificationDto) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.docId = docId;
		this.docType = docType;
		this.verificationDto = verificationDto;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getDocId() {
		return docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public VerificationDto getVerificationDto() {
		return verificationDto;
	}

	public void setVerificationDto(VerificationDto verificationDto) {
		this.verificationDto = verificationDto;
	}
}
