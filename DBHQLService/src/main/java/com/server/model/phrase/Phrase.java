package com.server.model.phrase;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "Phrase")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Phrase implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "PHRASE_ID")
	private int phraseId;

	@Column
	private String phraseName;

	@Column
	private String phraseDescription;

	public Phrase() {
		// TODO Auto-generated constructor stub
	}

	public Phrase(String phraseName, String phraseDescription) {
		super();
		this.phraseName = phraseName;
		this.phraseDescription = phraseDescription;
	}

	public int getPhraseId() {
		return phraseId;
	}

	public void setPhraseId(int phraseId) {
		this.phraseId = phraseId;
	}

	public String getPhraseName() {
		return phraseName;
	}

	public void setPhraseName(String phraseName) {
		this.phraseName = phraseName;
	}

	public String getPhraseDescription() {
		return phraseDescription;
	}

	public void setPhraseDescription(String phraseDescription) {
		this.phraseDescription = phraseDescription;
	}

	// @Override
	// public String toString() {
	// return "Phrase [ " + phraseId + " , " + phraseName + " , " +
	// phraseDescription + " ]";
	// }

}
