package com.client.test.link;

import java.util.List;

import com.client.controller.link.LinkController;
import com.client.model.link.Link;

public class TestLink {

	private LinkController linkController = new LinkController();

	public void listLink() throws Exception {
		List<Object> list3 = linkController.getLinkList();
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
	}

	public Link getLinkbyId(int id) throws Exception {
		Link link = linkController.getLinkbyId(id);
		return link;
	}

	public void addLink(Link link) throws Exception {
		linkController.addLink(link);
	}

	public void updateLink(int id, Link link) throws Exception {
		linkController.updateLink(link);
	}

	public void deleteLink(int id) throws Exception {
		linkController.deteleLink(id);
	}

}
