package com.cg.backgroundverification.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.backgroundverification.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {

	public List<Document> findByLoginEmpId(Integer empId);
	
	public List<Document> findByLoginEmpName(String empName);
}
