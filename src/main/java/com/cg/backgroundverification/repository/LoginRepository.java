package com.cg.backgroundverification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.backgroundverification.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

}
