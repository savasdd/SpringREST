package com.client.model.location;

import java.io.Serializable;

import com.client.model.document.Document;

public class Location implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int locationId;
	private String name;
	private String scopeId;
	private int startsAt;
	private int length;
	private boolean isChanged;
	private boolean isDeleted;
	private Document fk_documentId;

	public Location() {
		// TODO Auto-generated constructor stub
	}

	public Location(String name, String scopeId, int startsAt, int length, boolean isChanged, boolean isDeleted,
			Document fk_documentId) {
		super();
		this.name = name;
		this.scopeId = scopeId;
		this.startsAt = startsAt;
		this.length = length;
		this.isChanged = isChanged;
		this.isDeleted = isDeleted;
		this.fk_documentId = fk_documentId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScopeId() {
		return scopeId;
	}

	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}

	public int getStartsAt() {
		return startsAt;
	}

	public void setStartsAt(int startsAt) {
		this.startsAt = startsAt;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isChanged() {
		return isChanged;
	}

	public void setChanged(boolean isChanged) {
		this.isChanged = isChanged;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Document getFk_documentId() {
		return fk_documentId;
	}

	public void setFk_documentId(Document fk_documentId) {
		this.fk_documentId = fk_documentId;
	}

	@Override
	public String toString() {
		return "Location [ " + locationId + " , " + name + " , " + scopeId + " , " + startsAt + " , " + isChanged
				+ " , " + isDeleted + " ]";
	}

}
