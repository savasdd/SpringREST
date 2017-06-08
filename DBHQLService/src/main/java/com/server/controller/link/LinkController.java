package com.server.controller.link;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.server.model.link.Link;
import com.server.model.util.Status;
import com.server.services.link.LinkServices;

@Controller
@RequestMapping("/link")
public class LinkController {

	@Autowired
	LinkServices linkServices;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status add(@RequestBody Link link) {
		try {
			linkServices.addLink(link);
			return new Status(1, "Record added!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Link get(@PathVariable("id") int id) {
		Link link = null;
		try {
			link = linkServices.getLinkbyId(id);
		} catch (Exception e) {
			System.out.println("id okuma hatası " + e.getMessage());

		}

		return link;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<Link> gets() {
		List<Link> doList = null;
		try {
			doList = linkServices.getLinkList();
		} catch (Exception e) {
			System.out.println("listeleme hatası " + e.getMessage());

		}
		return doList;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public @ResponseBody Status delete(@PathVariable("id") int id) {
		try {
			linkServices.deteleLink(id);
			return new Status(1, "Record deleted!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status update(@RequestBody Link link) {
		try {
			linkServices.updateLink(link);
			return new Status(1, "Kayıt güncelleme başarılı!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

}
