
package com.server.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.server.model.user.User;
import com.server.model.util.Status;
import com.server.services.user.UserServices;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServices userServices;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status add(@RequestBody User user) {
		try {
			userServices.addUser(user);
			return new Status(1, "Record added!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody User get(@PathVariable("id") int id) {
		User user = null;
		try {
			user = userServices.getUserbyId(id);
		} catch (Exception e) {
			System.out.println("id okuma hatasi" + e.getMessage());
		}

		return user;
	}

	// @RequestMapping(value = "/{name}", method = RequestMethod.GET)
	// public @ResponseBody User isValid(@PathVariable("name") String name) {
	// User user = null;
	// try {
	// user = userServices.getIsValid(name);
	// } catch (Exception e) {
	// System.out.println("Isim okuma hatasi: " + e.getMessage());
	// }
	// return user;
	// }

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<User> gets() {
		List<User> users = null;
		try {
			users = userServices.getUserList();
		} catch (Exception e) {
			System.out.println("hata");
			e.printStackTrace();
		}
		return users;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public @ResponseBody Status delete(@PathVariable("id") int id) {
		try {
			userServices.deteleUser(id);
			return new Status(1, "Record deleted!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status update(@RequestBody User user) {
		try {
			userServices.updateUser(user);
			return new Status(1, "Record updated!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

}
