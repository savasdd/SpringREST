package com.client.test.document;

import java.util.List;

import com.client.controller.document.DocumentController;
import com.client.model.document.Document;

public class TestDocument {

	private DocumentController documentController = new DocumentController();

	public void listDocument() throws Exception {
		List<Object> list3 = documentController.getDocList();
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
	}

	public void addDocument(Document document) throws Exception {
		documentController.addDoc(document);
	}

	public Document getDocumentbyId(int id) throws Exception {
		Document document = documentController.getDocbyId(id);
		return document;
	}

	public void updateDocument(Document document) throws Exception {
		documentController.updateDoc(document);
	}

	public void deleteDocument(int id) throws Exception {
		documentController.deteleDoc(id);
	}
}
