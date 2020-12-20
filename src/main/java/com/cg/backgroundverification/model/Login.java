package com.cg.backgroundverification.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity(name = "LOGIN")
@Data
public class Login {

	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "EMPLOYEE_ID")
	private int empId;
	
	@Column(name = "EMPLOYEE_NAME", nullable = false)
	private String name;
	
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@OneToOne @JoinColumn(name = "ROLE_ID", nullable = false)
	private RoleMaster roleMaster;
}
