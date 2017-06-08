package com.server.dao.scope;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.server.model.scope.Scope;
import com.server.session.JpaEntityManagerFactory;

public class ScopeDao {

	@Autowired
	JpaEntityManagerFactory factory;

	public boolean addScope(Scope scope) throws Exception {
		factory.open();
		factory.begin();
		factory.manager.persist(scope);
		factory.commit();
		factory.close();

		return false;
	}

	public Scope getScopebyId(int id) throws Exception {
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Scope> getScopeList() throws Exception {
		factory.open();
		Query query = factory.manager.createQuery("Select u From Scope u");
		List<Scope> list = query.getResultList();

		return list;

	}

	public boolean deteleScope(int id) throws Exception {
		factory.open();
		Scope scope = factory.manager.find(Scope.class, id);
		factory.begin();
		factory.manager.remove(scope);
		factory.commit();
		factory.close();
		return false;
	}

	public boolean updateScope(int id, Scope scope) throws Exception {

		return false;
	}

}
