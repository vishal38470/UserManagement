package com.user.management.service;

import java.util.HashMap;
import java.util.Map;

import com.user.management.model.User;

public class UserService {

	public Map<Integer, User> insertUsers(String name, int age, String Address) {
		
		Map<Integer,User> users = new HashMap<Integer,User>();
		users.put(001, new User(name,age,Address));
		
		return users;
		
	}
	
	
	
	
	
	
	
}
