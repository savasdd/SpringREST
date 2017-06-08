package com.server.controller.scope;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.server.model.scope.Scope;
import com.server.model.util.Status;
import com.server.services.scope.ScopeServices;

@Controller
@RequestMapping("/scope")
public class ScopeController {

	@Autowired
	ScopeServices scopeServices;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status add(@RequestBody Scope scope) {
		try {
			scopeServices.addScope(scope);
			return new Status(1, "Record added!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Scope get(@PathVariable("id") int id) {
		Scope scope = null;
		try {
			scope = scopeServices.getScopebyId(id);
		} catch (Exception e) {
			System.out.println("id okuma hatası " + e.getMessage());

		}

		return scope;
	}

	// @RequestMapping(value = "/list", method = RequestMethod.GET)
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<Scope> gets() {
		List<Scope> doList = null;
		try {
			doList = scopeServices.getScopeList();
		} catch (Exception e) {
			System.out.println("listeleme hatası " + e.getMessage());

		}
		return doList;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public @ResponseBody Status delete(@PathVariable("id") int id) {
		try {
			scopeServices.deteleScope(id);
			return new Status(1, "Record deleted!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status update(@PathVariable("id") int id, @RequestBody Scope scope) {
		try {
			scopeServices.updateScope(id, scope);
			return new Status(1, "Kayıt güncelleme başarılı!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

}
