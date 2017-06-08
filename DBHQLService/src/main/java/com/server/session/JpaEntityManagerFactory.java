package com.server.session;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JpaEntityManagerFactory {

	public EntityManager manager;

	public void open() {

		manager = getManager();
	}

	public EntityManager getManager() {

		return Persistence.createEntityManagerFactory("PersistenceUnit").createEntityManager();
	}

	public void begin() {

		manager.getTransaction().begin();
	}

	public void commit() {

		manager.getTransaction().commit();
	}

	public void close() {

		manager.close();
	}
}
