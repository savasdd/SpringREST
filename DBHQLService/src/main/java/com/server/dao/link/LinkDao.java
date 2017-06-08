package com.server.dao.link;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.server.model.link.Link;
import com.server.session.JpaEntityManagerFactory;

public class LinkDao {

	@Autowired
	JpaEntityManagerFactory factory;

	public Link addLink(Link link) throws Exception {
		factory.open();
		factory.begin();
		factory.manager.persist(link);
		factory.commit();
		factory.close();

		return link;
	}

	public Link getLinkbyId(int id) throws Exception {
		factory.open();
		Link link = factory.manager.find(Link.class, id);
		factory.close();
		return link;
	}

	@SuppressWarnings("unchecked")
	public List<Link> getLinkList() throws Exception {
		factory.open();
		Query query = factory.manager.createQuery("Select u From Link u");
		List<Link> list = query.getResultList();
		return list;
	}

	public boolean deteleLink(int id) throws Exception {

		factory.open();
		Link link = factory.manager.find(Link.class, id);
		factory.begin();
		factory.manager.remove(link);
		factory.commit();
		factory.close();

		return false;
	}

	public boolean updateLink(Link link) throws Exception {

		factory.open();
		Link link2 = factory.manager.find(Link.class, link.getLinkId());
		factory.begin();
		link2.setDescription(link.getDescription());
		link2.setValid(link.isValid());
		factory.manager.merge(link2);
		factory.commit();
		factory.close();

		return false;
	}

}
