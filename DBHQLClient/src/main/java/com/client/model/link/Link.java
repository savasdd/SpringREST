package com.client.model.link;

import java.io.Serializable;

import com.client.model.location.Location;
import com.client.model.phrase.Phrase;

public class Link implements Serializable {

	private static final long serialVersionUID = 1L;

	private int linkId;
	private boolean isValid;
	private String description;
	private Location fk_sourceLocationId;
	private Location fk_targetLocationId;
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
