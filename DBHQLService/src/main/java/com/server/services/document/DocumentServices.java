package com.server.services.document;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.server.dao.document.DocumentDao;
import com.server.model.document.Document;

public class DocumentServices {

	@Autowired
	DocumentDao documentDao;

	public Document addDocument(Document document) throws Exception {
		// TODO Auto-generated method stub
		return documentDao.addDocument(document);
	}

	public Document getDocumentbyId(int id, String userName) throws Exception {
		// TODO Auto-generated method stub
		return documentDao.getDocumentbyId(id, userName);
	}

	public Document getDocumentbyId(int id) throws Exception {

		return documentDao.getDocumentbyId(id);
	}

	public List<Document> getDocumentList() throws Exception {
		// TODO Auto-generated method stub
		return documentDao.getDocumentList();
	}

	public boolean deteleDocument(int id) throws Exception {
		// TODO Auto-generated method stub
		return documentDao.deteleDocument(id);
	}

	public boolean updateDocument(Document document) throws Exception {
		return documentDao.updateDocument(document);
	}

}
