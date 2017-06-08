package com.server.services.phrase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.server.dao.phrase.PhraseDao;
import com.server.model.phrase.Phrase;

public class PhraseServices {

	@Autowired
	PhraseDao phraseDao;

	public Phrase addPhrase(Phrase phrase) throws Exception {
		// TODO Auto-generated method stub
		return phraseDao.addPhrase(phrase);
	}

	public Phrase getPhrasebyId(int id) throws Exception {
		// TODO Auto-generated method stub
		return phraseDao.getPhrasebyId(id);
	}

	public List<Phrase> getPhraseList() throws Exception {
		// TODO Auto-generated method stub
		return phraseDao.getPhraseList();
	}

	public boolean detelePhrase(int id) throws Exception {
		// TODO Auto-generated method stub
		return phraseDao.detelePhrase(id);
	}

	public boolean updatePhrase(int id, Phrase phrase) throws Exception {
		// TODO Auto-generated method stub
		return phraseDao.updatePhrase(id, phrase);
	}

}
