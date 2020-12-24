package com.cg.backgroundverification.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.backgroundverification.dto.EmployeeDocumentDto;
import com.cg.backgroundverification.repository.DocumentRepository;
import com.cg.backgroundverification.service.EmployeeDocumentService;

@Service
public class EmployeeDocumentServiceImpl implements EmployeeDocumentService {
	
	@Autowired
	DocumentRepository documentRepository;

	@Override
	public String uploadDocument(EmployeeDocumentDto employeeDocumentDto) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> viewStatus(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
