package com.cg.backgroundverification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.backgroundverification.model.VerificationDetails;

@Repository
public interface VerificationDetailsRepository extends JpaRepository<VerificationDetails, Integer> {

}
