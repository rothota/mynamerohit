package org.cap.demo;

public class Login {
private String userName;
private String Password;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
@Override
public String toString() {
	return "Login [userName=" + userName + ", Password=" + Password + "]";
}


}
