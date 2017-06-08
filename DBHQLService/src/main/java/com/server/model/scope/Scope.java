package com.server.model.scope;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.server.model.location.Location;

@Entity
@Table(name = "Scope")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Scope implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "SCOPE_ID")
	private int scopeId;

	@Column
	private String scopeDescription;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_locationId")
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

	// @Override
	// public String toString() {
	// return "Scope [ " + scopeId + " , " + scopeDescription + " ]";
	// }
	

}
