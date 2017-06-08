package com.client.model.document;

import java.io.Serializable;

public class Document implements Serializable {

	private static final long serialVersionUID = 1L;

	private int documentId;
	private int versiyonNo;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Document [ " + documentId + " , " + versiyonNo + " , " + documentContent + " ]";
	}

}
