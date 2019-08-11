package com.dev.beans;

public class Student {

	private Integer id;
	private String Name;
	private String Email;
	private String Password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password + "]";
	}
	
}
