package com.server.model.document;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "Document")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Document implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "DOCUMENT_ID")
	private int documentId;

	@Column
	private int versiyonNo;

	@Column
	private String documentContent;

	public Document() {
		// TODO Auto-generated constructor stub
	}

	public Document(int versiyonNo, String documentContent) {
		super();
		this.versiyonNo = versiyonNo;
		this.documentContent = documentContent;
	}

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public int getVersiyonNo() {
		return versiyonNo;
	}

	public void setVersiyonNo(int versiyonNo) {
		this.versiyonNo = versiyonNo;
	}

	public String getDocumentContent() {
		return documentContent;
	}

	public void setDocumentContent(String documentContent) {
		this.documentContent = documentContent;
	}

}
