package com.face.BO;

public class LoginBO
{
private String Username;
private String Password;
private String name;
private String Emailid;
private String PhoneNO;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmailid() {
	return Emailid;
}

public void setEmailid(String emailid) {
	Emailid = emailid;
}

public String getPhoneNO() {
	return PhoneNO;
}

public void setPhoneNO(String phoneNO) {
	PhoneNO = phoneNO;
}

public String getUsername() {
	return Username;
}

public String getPassword() {
	return Password;
}

public void setUsername(String username) {
	Username = username;
}

public void setPassword(String password) {
	Password = password;
}


}
