package br.com.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "loginMB")
@SessionScoped
public class LoginManagedBean {

	private String login;
	private String password;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
//	 public LoginManagedBean() {}
	public String acessar() {
		System.out.println("Login do " + login);
		System.out.println("Password do " + password);
		return null;

	}
}
