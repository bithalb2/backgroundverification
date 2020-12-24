package com.cg.backgroundverification.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "LOGIN")
public class Login {

	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "EMPLOYEE_ID")
	private Integer empId;
	
	@Column(name = "EMPLOYEE_NAME", nullable = false, unique = true)
	private String empName;
	
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@OneToOne @JoinColumn(name = "ROLE_ID", nullable = false)
	private RoleMaster roleMaster;
	
	public Login() {
		super();
	}

	public Login(Integer empId, String empName, String password, RoleMaster roleMaster) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.password = password;
		this.roleMaster = roleMaster;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return empName;
	}

	public void setName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RoleMaster getRoleMaster() {
		return roleMaster;
	}

	public void setRoleMaster(RoleMaster roleMaster) {
		this.roleMaster = roleMaster;
	}
}
