package com.client.model.phrase;

import java.io.Serializable;


public class Phrase implements Serializable {

	private static final long serialVersionUID = 1L;

	private int phraseId;
	private String phraseName;
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

	@Override
	public String toString() {
		return "Phrase [ " + phraseId + " , " + phraseName + " , " + phraseDescription + " ]";
	}

}
