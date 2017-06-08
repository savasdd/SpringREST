package com.client.model.user;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userId;
	private String role;
	private String country;
	private boolean isValid;
	private String password;
	private String eMail;
	private String userName;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String country, String userName, String role, String password, String eMail,
			boolean isValid) {
		super();
		this.role = role;
		this.country = country;
		this.isValid = isValid;
		this.password = password;
		this.eMail = eMail;
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User [ " + userId + " , " + role + " , " + country + " , " + isValid + " , " + password + " , " + eMail
				+ " , " + userName + " ]";
	}

}
