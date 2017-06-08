package com.server.services.scope;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.server.dao.scope.ScopeDao;
import com.server.model.scope.Scope;

public class ScopeServices {

	@Autowired
	ScopeDao scopeDao;

	public boolean addScope(Scope scope) throws Exception {
		// TODO Auto-generated method stub
		return scopeDao.addScope(scope);
	}

	public Scope getScopebyId(int id) throws Exception {
		// TODO Auto-generated method stub
		return scopeDao.getScopebyId(id);
	}

	public List<Scope> getScopeList() throws Exception {
		// TODO Auto-generated method stub
		return scopeDao.getScopeList();
	}

	public boolean deteleScope(int id) throws Exception {
		// TODO Auto-generated method stub
		return scopeDao.deteleScope(id);
	}

	public boolean updateScope(int id, Scope scope) throws Exception {
		// TODO Auto-generated method stub
		return scopeDao.updateScope(id, scope);
	}

}
