package com.cg.backgroundverification.dto;

public class LoginDto {

	private Integer empId;
	private String password;
	private Integer roleId;
	
	public LoginDto() {
		super();
	}
	
	public LoginDto(Integer empId, String password, Integer roleId) {
		super();
		this.empId = empId;
		this.password = password;
		this.roleId = roleId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
}
