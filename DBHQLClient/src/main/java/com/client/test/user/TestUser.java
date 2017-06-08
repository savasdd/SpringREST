package com.client.test.user;

import java.util.List;

import com.client.controller.user.UserController;
import com.client.model.user.User;

public class TestUser {

	private UserController userController = new UserController();

	public void listUser() throws Exception {
		List<Object> list3 = userController.getUserList();
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
	}

	public void addUser(User user) throws Exception {
		userController.addUser(user);
	}

	public User getUserbyId(int id) throws Exception {
		User user = userController.getUserbyId(id);
		return user;
	}

	public void updateUser(User user) throws Exception {
		
		userController.updateUser(user);
	}

	public void deleteUser(int id) throws Exception {
		userController.deteleUser(id);
	}

}
