package com.user.management.model;

public class User {

	int userID;
	
	String name;
	
	int age;
	
	String address;
boolean isActive=true;
	public int getUserID() {
		return userID;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}


	public boolean isActive() {
		
		return isActive;
	}

	public User(String name, int age, String address) {
		super();
		this.userID = userID;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
	
	
	
	
	
	
	
}
