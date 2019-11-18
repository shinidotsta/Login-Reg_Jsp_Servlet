package com.face.BO;

public class RegisterBO 
{

	private String name;
	
	private String emailId;
	private String username;
	private String pswd;
	private String phno;
	
	
	public String getName() {
		return name;
	}
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public void setName(String name) {
		this.name = name;
	}
}
