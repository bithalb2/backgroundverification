package com.cg.backgroundverification.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "DOCUMENT_MASTER")
public class DocumentMaster {

	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "DOCUMENT_TYPE_ID")
	private Integer docTypeId;
	
	@Column(name = "DOCUMENT_CATEGORY", nullable = false)
	private String docCategory;
	
	public DocumentMaster() {
		super();
	}

	public DocumentMaster(Integer docTypeId, String docCategory) {
		super();
		this.docTypeId = docTypeId;
		this.docCategory = docCategory;
	}

	public Integer getDocTypeId() {
		return docTypeId;
	}

	public void setDocTypeId(Integer docTypeId) {
		this.docTypeId = docTypeId;
	}

	public String getDocCategory() {
		return docCategory;
	}

	public void setDocCategory(String docCategory) {
		this.docCategory = docCategory;
	}
}
