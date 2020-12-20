package com.cg.backgroundverification.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "ROLE_MASTER")
@Data
public class RoleMaster {

	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "ROLE_ID")
	private Integer roleId;
	
	@Column(name = "ROLE_NAME", nullable = false)
	private String roleName;
}
