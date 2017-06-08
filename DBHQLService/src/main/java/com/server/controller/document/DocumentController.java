package com.server.controller.document;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.server.model.document.Document;
import com.server.model.util.Status;
import com.server.services.document.DocumentServices;

@Controller
@RequestMapping("/document")
public class DocumentController {

	@Autowired
	DocumentServices documentServices;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status add(@RequestBody Document document) {
		try {
			documentServices.addDocument(document);
			return new Status(1, "Record added!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public @ResponseBody Document get(@PathVariable("id") int id, @RequestBody String userName) {
		Document document = null;
		try {
			document = documentServices.getDocumentbyId(id, userName);
		} catch (Exception e) {
			System.out.println("id okuma hatası " + e.getMessage());

		}

		return document;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Document get(@PathVariable("id") int id) {
		Document document = null;
		try {
			document = documentServices.getDocumentbyId(id);
		} catch (Exception e) {
			System.out.println("id okuma hatasi" + e.getMessage());
		}

		return document;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<Document> gets() {
		List<Document> doList = null;
		try {
			doList = documentServices.getDocumentList();
		} catch (Exception e) {
			System.out.println("listeleme hatası " + e.getMessage());

		}
		return doList;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public @ResponseBody Status delete(@PathVariable("id") int id) {
		try {
			documentServices.deteleDocument(id);
			return new Status(1, "Record deleted!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status update(@RequestBody Document document) {
		try {
			documentServices.updateDocument(document);
			return new Status(1, "Record updated!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

}
