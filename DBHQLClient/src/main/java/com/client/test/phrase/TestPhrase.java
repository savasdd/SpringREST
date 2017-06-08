package com.client.test.phrase;

import java.util.List;

import com.client.controller.phrase.PhraseController;
import com.client.model.phrase.Phrase;

public class TestPhrase {

	private PhraseController phraseController = new PhraseController();

	public void listPhrase() throws Exception {
		List<Object> list3 = phraseController.getPhraseList();
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
	}

	public void addPhrase(Phrase phrase) throws Exception {
		phraseController.addPhrase(phrase);
	}

	public void updatePhrase(int id, Phrase phrase) throws Exception {
		phraseController.putPhrase(id, phrase);
	}

	public void deletePhrase(int id) throws Exception {
		phraseController.detelePhrase(id);
	}

}
