package com.server.dao.document;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.server.model.document.Document;
import com.server.session.JpaEntityManagerFactory;

public class DocumentDao {

	@Autowired
	JpaEntityManagerFactory factory;

	public Document addDocument(Document document) throws Exception {
		factory.open();
		factory.begin();
		factory.manager.persist(document);
		factory.commit();
		factory.close();
		return document;

	}

	public Document getDocumentbyId(int id, String userName) throws Exception {
		// if (userDao.getIsValid(userName).isValid()) {
		// session = sessionFactory.openSession();
		// Document document = (Document) session.load(Document.class, id);
		// tx = session.getTransaction();
		// session.beginTransaction();
		// tx.commit();
		// // session.close();
		// return document;
		// }
		return null;

	}

	public Document getDocumentbyId(int id) throws Exception {
		factory.open();
		Document document = factory.manager.find(Document.class, id);
		factory.close();
		return document;
	}

	@SuppressWarnings("unchecked")
	public List<Document> getDocumentList() throws Exception {
		factory.open();
		Query query = factory.getManager().createQuery("Select u From Document u");
		List<Document> document = query.getResultList();
		return document;

	}

	public boolean deteleDocument(int id) throws Exception {
		factory.open();
		Document document = factory.manager.find(Document.class, id);
		factory.begin();
		factory.manager.remove(document);
		factory.commit();
		factory.close();

		return false;
	}

	public boolean updateDocument(Document document) throws Exception {
		factory.open();
		Document document2 = factory.manager.find(Document.class, document.getDocumentId());
		factory.begin();
		document2.setDocumentContent(document.getDocumentContent());
		document2.setVersiyonNo(document.getVersiyonNo());
		factory.manager.merge(document2);
		factory.commit();
		factory.close();

		return false;
	}

}
