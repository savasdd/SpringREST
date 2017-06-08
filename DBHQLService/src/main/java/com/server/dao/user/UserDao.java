package com.server.dao.user;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.server.model.user.User;
import com.server.session.JpaEntityManagerFactory;

public class UserDao {

	@Autowired
	JpaEntityManagerFactory factory;

	public User addUser(User user) throws Exception {
		factory.open();
		factory.begin();
		factory.manager.persist(user);
		factory.commit();
		factory.close();
		return user;
	}

	public User getUserbyId(int id) throws Exception {
		factory.open();
		User user = factory.manager.find(User.class, id);
		factory.close();
		return user;
	}

	@SuppressWarnings("unchecked")
	public List<User> getUserList() throws Exception {
		factory.open();
		Query query = factory.manager.createQuery("Select u From User u");
		List<User> user = query.getResultList();
		return user;
	}

	public boolean deteleUser(int id) throws Exception {

		factory.open();
		User user = factory.manager.find(User.class, id);
		factory.begin();
		factory.manager.remove(user);
		factory.commit();
		factory.close();

		return false;
	}

	public boolean updateUser(User user) throws Exception {

		factory.open();
		User u = factory.manager.find(User.class, user.getUserId());
		factory.begin();
		u.setRole(user.getRole());
		u.setUserName(user.getUserName());
		u.setCountry(user.getCountry());
		u.seteMail(user.geteMail());
		u.setPassword(user.getPassword());
		u.setValid(user.isValid());
		factory.manager.merge(u);
		factory.commit();
		factory.close();

		return false;

	}

	public User getIsValid(String name) throws Exception {

		// session = sessionFactory.openSession();
		// Query query = session.createQuery("from User where userName=
		// :userName");
		// query.setString("userName", name);
		// User user = (User) query.uniqueResult();
		// tx = session.getTransaction();
		// session.beginTransaction();
		// tx.commit();
		return null;
	}

}
