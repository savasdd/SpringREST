package com.server.dao.phrase;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.server.model.phrase.Phrase;
import com.server.session.JpaEntityManagerFactory;

public class PhraseDao {

	@Autowired
	JpaEntityManagerFactory factory;

	public Phrase addPhrase(Phrase phrase) throws Exception {
		factory.open();
		factory.begin();
		factory.manager.persist(phrase);
		factory.commit();
		factory.close();

		return phrase;
	}

	public Phrase getPhrasebyId(int id) throws Exception {

		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Phrase> getPhraseList() throws Exception {
		factory.open();
		Query query = factory.manager.createQuery("Select u From Phrase u");
		List<Phrase> list = query.getResultList();
		return list;
	}

	public boolean detelePhrase(int id) throws Exception {
		factory.open();
		Phrase phrase = factory.manager.find(Phrase.class, id);
		factory.begin();
		factory.manager.remove(phrase);
		factory.commit();
		factory.close();

		return false;
	}

	public boolean updatePhrase(int id, Phrase phrase) throws Exception {

		return false;
	}

}
