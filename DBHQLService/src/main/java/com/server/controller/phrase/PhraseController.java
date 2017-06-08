
package com.server.controller.phrase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.server.model.phrase.Phrase;
import com.server.model.util.Status;
import com.server.services.phrase.PhraseServices;

@Controller
@RequestMapping("/phrase")
public class PhraseController {

	@Autowired
	PhraseServices phraseServices;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status add(@RequestBody Phrase phrase) {
		try {
			phraseServices.addPhrase(phrase);
			return new Status(1, "Record added!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Phrase get(@PathVariable("id") int id) {
		Phrase phrase = null;
		try {
			phrase = phraseServices.getPhrasebyId(id);
		} catch (Exception e) {
			System.out.println("id okuma hatası " + e.getMessage());

		}

		return phrase;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<Phrase> gets() {
		List<Phrase> doList = null;
		try {
			doList = phraseServices.getPhraseList();
		} catch (Exception e) {
			System.out.println("listeleme hatası " + e.getMessage());

		}
		return doList;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public @ResponseBody Status delete(@PathVariable("id") int id) {
		try {
			phraseServices.detelePhrase(id);
			return new Status(1, "Record deleted!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status update(@PathVariable("id") int id, @RequestBody Phrase phrase) {
		try {
			phraseServices.updatePhrase(id, phrase);
			return new Status(1, "Kayıt güncelleme başarılı!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

}
