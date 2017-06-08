package com.server.services.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.server.dao.user.UserDao;
import com.server.model.user.User;

public class UserServices {

	@Autowired
	UserDao userDao;

	public User addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	public List<User> getUserList() throws Exception {
		// TODO Auto-generated method stub
		return userDao.getUserList();
	}

	public User getUserbyId(int id) throws Exception {

		return userDao.getUserbyId(id);
	}

	public boolean deteleUser(int id) throws Exception {
		// TODO Auto-generated method stub
		return userDao.deteleUser(id);
	}

	public boolean updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	public User getIsValid(String name) throws Exception {

		return userDao.getIsValid(name);
	}

}
