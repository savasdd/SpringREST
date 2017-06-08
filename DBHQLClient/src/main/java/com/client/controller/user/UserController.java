package com.client.controller.user;

import java.util.List;

import com.client.controller.rest.Template;
import com.client.model.user.User;
import com.client.util.Status;
import com.client.util.URI;

public class UserController {

	Template template = new Template();

	public void addUser(User user) throws Exception {
		Status status = template.getRest().postForObject(URI.SERVER_URI + URI.CREATE_USER, user, Status.class);
		System.out.println(status.getMesaj());

	}

	public User getUserbyName(String name) throws Exception {
		User user = template.getRest().getForObject(URI.SERVER_URI + "/user/" + name, User.class);
		return user;
	}

	public User getUserbyId(int id) throws Exception {
		User user = template.getRest().getForObject(URI.SERVER_URI + "/user/" + id, User.class);
		return user;
	}

	@SuppressWarnings("unchecked")
	public List<Object> getUserList() throws Exception {
		List<Object> user = template.getRest().getForObject(URI.SERVER_URI + URI.GET_ALL_USER, List.class);
		return user;
	}

	public void deteleUser(int id) throws Exception {
		Status status = template.getRest().getForObject(URI.SERVER_URI + "/user/delete/" + id, Status.class);
		System.out.println(status.getMesaj());
	}

	public void updateUser(User user) throws Exception {
		Status status = template.getRest().postForObject(URI.SERVER_URI + "/user/update", user, Status.class);
		System.out.println(status.getMesaj());
	}

}
