package com.user.management.controller;

import com.user.management.model.User;
import com.user.management.service.UserService;

public class UserController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//User users = new User("vishal", 25, "Indira Nagar");
		UserService userservice = new UserService();
		
		int userID=userservice.insertUsers("vishal", 25, "Indira Nagar");
		userservice.insertUsers("Swati", 28, "Sweden"); 
		System.out.println(userservice.getAllUsers());
		userservice.getUser(userID);
		
		userservice.updateUser(userID, "joshi", 26, "Aditya Estate");
		
		User user =userservice.getUser(userID);
		
		System.out.println(user);
		
		userservice.deleteUser(userID);
		
		System.out.println(userservice.getAllUsers());
//		
		
		
		
		
		
	}

}
