package com.example.demo.app.login;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {

	@Size(min = 1, max = 20, message = "Please input 20characters or less")
	private String name;
	
	@NotNull
	private String password;

	public LoginForm() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
