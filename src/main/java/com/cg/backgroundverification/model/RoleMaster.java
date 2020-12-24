package com.cg.backgroundverification.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ROLE_MASTER")
public class RoleMaster {

	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "ROLE_ID")
	private Integer roleId;
	
	@Column(name = "ROLE_NAME", nullable = false)
	private String roleName;

	public RoleMaster() {
		super();
	}

	public RoleMaster(Integer roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
