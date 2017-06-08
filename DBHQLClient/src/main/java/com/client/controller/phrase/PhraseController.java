package com.client.controller.phrase;

import java.util.List;

import com.client.controller.rest.Template;
import com.client.model.phrase.Phrase;
import com.client.util.Status;
import com.client.util.URI;

public class PhraseController {

	Template template = new Template();

	public void addPhrase(Phrase phrase) throws Exception {
		Status status = template.getRest().postForObject(URI.SERVER_URI + URI.CREATE_PHRASE, phrase, Status.class);
		System.out.println(status.getMesaj());
	}

	public Phrase getPhrasebyId(int id) throws Exception {

		Phrase phrase = template.getRest().getForObject(URI.SERVER_URI + "/phrase/" + id, Phrase.class);
		return phrase;
	}

	@SuppressWarnings("unchecked")
	public List<Object> getPhraseList() throws Exception {

		List<Object> list = template.getRest().getForObject(URI.SERVER_URI + URI.GET_ALL_PHRASE, List.class);
		return list;
	}

	public void detelePhrase(int id) throws Exception {
		Status status = template.getRest().getForObject(URI.SERVER_URI + "/phrase/delete/" + id, Status.class);
		System.out.println(status.getMesaj());
	}

	public void putPhrase(int id, Phrase phrase) throws Exception {
		template.getRest().put(URI.SERVER_URI + "/phrase/update/" + id, phrase);

	}

}
