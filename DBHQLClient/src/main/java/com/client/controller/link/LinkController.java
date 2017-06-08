package com.client.controller.link;

import java.util.List;

import com.client.controller.rest.Template;
import com.client.model.link.Link;
import com.client.util.Status;
import com.client.util.URI;

public class LinkController {

	Template template = new Template();

	public void addLink(Link link) throws Exception {
		Status status = template.getRest().postForObject(URI.SERVER_URI + URI.CREATE_LINK, link, Status.class);
		System.out.println(status.getMesaj());

	}

	public Link getLinkbyId(int id) throws Exception {
		Link link = template.getRest().getForObject(URI.SERVER_URI + "/link/" + id, Link.class);
		return link;
	}

	@SuppressWarnings("unchecked")
	public List<Object> getLinkList() throws Exception {
		List<Object> list = template.getRest().getForObject(URI.SERVER_URI + URI.GET_ALL_LINK, List.class);
		return list;
	}

	public void deteleLink(int id) throws Exception {
		Status status = template.getRest().getForObject(URI.SERVER_URI + "/link/delete/" + id, Status.class);
		System.out.println(status.getMesaj());
	}

	public void updateLink(Link link) throws Exception {
		template.getRest().put(URI.SERVER_URI + "/link/update", link);

	}

}
