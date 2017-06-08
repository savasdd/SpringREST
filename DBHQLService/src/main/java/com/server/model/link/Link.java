package com.server.model.link;

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
import com.server.model.phrase.Phrase;

@Entity
@Table(name = "Link")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Link implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "LINK_ID")
	private int linkId;

	@Column
	private boolean isValid;

	@Column
	private String description;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_sourceLocationId")
	private Location fk_sourceLocationId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_targetLocationId")
	private Location fk_targetLocationId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_phraseId")
	private Phrase fk_phraseId;

	public Link() {
		// TODO Auto-generated constructor stub
	}

	public Link(boolean isValid, String description, Location fk_sourceLocationId, Location fk_targetLocationId,
			Phrase fk_phraseId) {
		super();
		this.isValid = isValid;
		this.description = description;
		this.fk_sourceLocationId = fk_sourceLocationId;
		this.fk_targetLocationId = fk_targetLocationId;
		this.fk_phraseId = fk_phraseId;
	}

	public int getLinkId() {
		return linkId;
	}

	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Location getFk_sourceLocationId() {
		return fk_sourceLocationId;
	}

	public void setFk_sourceLocationId(Location fk_sourceLocationId) {
		this.fk_sourceLocationId = fk_sourceLocationId;
	}

	public Location getFk_targetLocationId() {
		return fk_targetLocationId;
	}

	public void setFk_targetLocationId(Location fk_targetLocationId) {
		this.fk_targetLocationId = fk_targetLocationId;
	}

	public Phrase getFk_phraseId() {
		return fk_phraseId;
	}

	public void setFk_phraseId(Phrase fk_phraseId) {
		this.fk_phraseId = fk_phraseId;
	}

	@Override
	public String toString() {
		return "Link [ " + linkId + " , " + isValid + " , " + description + " , " + " ]";
	}

}
