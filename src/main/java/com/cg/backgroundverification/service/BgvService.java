package com.cg.backgroundverification.service;

import java.util.List;

import com.cg.backgroundverification.dto.EmployeeDocumentDto;

public interface BgvService {

	public List<EmployeeDocumentDto> getById(Integer empId);
	
	public List<EmployeeDocumentDto> getByName(String empName);
	
	public EmployeeDocumentDto downloadDocument(Integer docId);
	
	public void approveStatus(Integer docId);
	
	public void rejectStatus(Integer docId);
}
