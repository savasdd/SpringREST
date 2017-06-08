package com.server.services.link;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.server.dao.link.LinkDao;
import com.server.model.link.Link;

public class LinkServices {

	@Autowired
	LinkDao linkDao;

	public Link addLink(Link link) throws Exception {
		// TODO Auto-generated method stub
		return linkDao.addLink(link);
	}

	public Link getLinkbyId(int id) throws Exception {
		// TODO Auto-generated method stub
		return linkDao.getLinkbyId(id);
	}

	public List<Link> getLinkList() throws Exception {
		// TODO Auto-generated method stub
		return linkDao.getLinkList();
	}

	public boolean deteleLink(int id) throws Exception {
		// TODO Auto-generated method stub
		return linkDao.deteleLink(id);
	}

	public boolean updateLink( Link link) throws Exception {
		// TODO Auto-generated method stub
		return linkDao.updateLink(link);
	}

}
