package greatlearning.emailapp.model;

import java.util.Scanner;
public class Employee {
private  String firstName, lastName, dept , emailId, passWord;

public  Employee(String fname, String lname) {
	
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	// TODO Auto-generated constructor stub
}

public String getFirstName() {
	return firstName;
}

public void  setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getPassWord() {
	return passWord;
}

public void setPassWord(String passWord) {
	this.passWord = passWord;
}

}
