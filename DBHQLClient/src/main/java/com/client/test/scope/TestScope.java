package com.client.test.scope;

import java.util.List;

import com.client.controller.scope.ScopeController;
import com.client.model.scope.Scope;

public class TestScope {

	private ScopeController scopeController = new ScopeController();

	public void listScope() throws Exception {
		List<Object> list3 = scopeController.getScopeList(null);
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
	}

	public void addScope(Scope scope) throws Exception {
		scopeController.addScope(scope);
	}

	public void updateScope(int id, Scope scope) throws Exception {
		scopeController.putScope(id, scope);
	}

	public void deleteScope(int id) throws Exception {
		scopeController.deteleScope(id);
	}

}
