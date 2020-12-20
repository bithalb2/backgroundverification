package com.cg.backgroundverification.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "DOCUMENT_MASTER")
@Data
public class DocumentMaster {

	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "DOCUMENT_TYPE_ID")
	private Integer docTypeId;
	
	@Column(name = "DOCUMENT_CATEGORY", nullable = false)
	private String docCategory;
}
