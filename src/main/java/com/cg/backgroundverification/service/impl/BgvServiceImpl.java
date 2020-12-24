package com.cg.backgroundverification.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.backgroundverification.dto.EmployeeDocumentDto;
import com.cg.backgroundverification.service.BgvService;

@Service
public class BgvServiceImpl implements BgvService {

	@Override
	public List<EmployeeDocumentDto> getById(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDocumentDto> getByName(String empName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDocumentDto downloadDocument(Integer docId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void approveStatus(Integer docId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rejectStatus(Integer docId) {
		// TODO Auto-generated method stub

	}

}
