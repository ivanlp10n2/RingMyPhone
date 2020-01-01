package ar.empanada.webapp.ringmyphone.auth;

import java.io.Serializable;

public class UserLoginForm implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	
	protected UserLoginForm() {
		
	}
	
	public static UserLoginForm of () {
		return new UserLoginForm();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
