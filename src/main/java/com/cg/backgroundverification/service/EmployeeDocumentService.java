package com.cg.backgroundverification.service;

import java.io.IOException;
import java.util.List;

import com.cg.backgroundverification.dto.EmployeeDocumentDto;

public interface EmployeeDocumentService {

	public String uploadDocument(EmployeeDocumentDto employeeDocumentDto) throws IOException;
	
	public List<String> viewStatus(Integer empId);
}
