package com.cg.backgroundverification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.backgroundverification.model.DocumentMaster;

@Repository
public interface DocumentMasterRepository extends JpaRepository<DocumentMaster, Integer> {

	public DocumentMaster findByDocCategory(String docCategory);
}
