package com.client.controller.scope;

import java.util.List;

import com.client.controller.rest.Template;
import com.client.model.scope.Scope;
import com.client.util.Status;
import com.client.util.URI;

public class ScopeController {

	Template template = new Template();

	public void addScope(Scope scope) throws Exception {
		Status status = template.getRest().postForObject(URI.SERVER_URI + URI.CREATE_SCOPE, scope, Status.class);
		System.out.println(status.getMesaj());

	}

	public Scope getScopebyId(int id) throws Exception {

		Scope scope = template.getRest().getForObject(URI.SERVER_URI + "/scope/" + id, Scope.class);
		return scope;
	}

	@SuppressWarnings("unchecked")
	public List<Object> getScopeList(String userName) throws Exception {
		List<Object> list = template.getRest().getForObject(URI.SERVER_URI + URI.GET_ALL_SCOPE, List.class);
		// List<Object> list = template.getRest().postForObject(URI.SERVER_URI +
		// URI.GET_ALL_SCOPE, userName, List.class);
		return list;
	}

	public void deteleScope(int id) throws Exception {
		Status status = template.getRest().getForObject(URI.SERVER_URI + "/scope/delete/" + id, Status.class);
		System.out.println(status.getMesaj());
	}

	public void putScope(int id, Scope scope) throws Exception {
		template.getRest().put(URI.SERVER_URI + "/scope/update/" + id, scope);

	}

}
