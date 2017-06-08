package com.client.controller.document;

import java.util.List;

import com.client.controller.rest.Template;
import com.client.model.document.Document;
import com.client.util.Status;
import com.client.util.URI;

public class DocumentController {

	Template template = new Template();

	public void addDoc(Document document) throws Exception {
		Status status = template.getRest().postForObject(URI.SERVER_URI + "/document/create/", document, Status.class);
		System.out.println(status.getMesaj());

	}

	public Document getDocbyId(int id, String userName) throws Exception {
		Document document = template.getRest().postForObject(URI.SERVER_URI + "/document/" + id, userName,
				Document.class);
		return document;
	}

	public Document getDocbyId(int id) throws Exception {
		Document document = template.getRest().getForObject(URI.SERVER_URI + "/document/" + id, Document.class);
		return document;
	}

	@SuppressWarnings("unchecked")
	public List<Object> getDocList() throws Exception {
		List<Object> doc = template.getRest().getForObject(URI.SERVER_URI + URI.GET_ALL_DOC, List.class);
		return doc;
	}

	public void deteleDoc(int id) throws Exception {

		Status status = template.getRest().getForObject(URI.SERVER_URI + "/document/delete/" + id, Status.class);
		System.out.println(status.getMesaj());
	}

	public void updateDoc(Document document) throws Exception {
		Status status = template.getRest().postForObject(URI.SERVER_URI + "/document/update", document, Status.class);
		System.out.println(status.getMesaj());

	}

}
