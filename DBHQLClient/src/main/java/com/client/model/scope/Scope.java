package com.client.model.scope;

import java.io.Serializable;

import com.client.model.location.Location;

public class Scope implements Serializable {

	private static final long serialVersionUID = 1L;

	private int scopeId;
	private String scopeDescription;
	private Location fk_locationId;

	public Scope() {
		// TODO Auto-generated constructor stub
	}

	public Scope(String scopeDescription, Location fk_locationId) {
		super();
		this.scopeDescription = scopeDescription;
		this.fk_locationId = fk_locationId;
	}

	public int getScopeId() {
		return scopeId;
	}

	public void setScopeId(int scopeId) {
		this.scopeId = scopeId;
	}

	public String getScopeDescription() {
		return scopeDescription;
	}

	public void setScopeDescription(String scopeDescription) {
		this.scopeDescription = scopeDescription;
	}

	public Location getFk_locationId() {
		return fk_locationId;
	}

	public void setFk_locationId(Location fk_locationId) {
		this.fk_locationId = fk_locationId;
	}

	@Override
	public String toString() {
		return "Scope [ " + scopeId + " , " + scopeDescription + " ]";
	}

}
