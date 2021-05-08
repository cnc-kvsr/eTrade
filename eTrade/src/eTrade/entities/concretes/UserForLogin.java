package eTrade.entities.concretes;

import eTrade.entities.abstracts.Dto;

public class UserForLogin implements Dto{
	private String email;
	private String password;
	
	public UserForLogin() {}

	public UserForLogin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
