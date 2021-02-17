package com.user.management.service;

import java.util.HashMap;
import java.util.Map;

import com.user.management.model.User;

public class UserService {
	static Map<Integer,User> users = new HashMap<Integer,User>();
	
	////////////////insert////////////////
	public int insertUsers(String name, int age, String Address) {
		
		 
		 int userID = users.size()+1;
		users.put(userID, new User(userID,name,age,Address));
		
		return userID;
		
	}
	///////remove////////////////
	public  void deleteUser(int userID) {
		users.remove(userID);
		
	}
	///////////////////getuser/////////////////
	public   User getUser(int userID)  {
		
		return users.get(userID);
		
		
	}
	//////update/////////////////
	public void updateUser(int userID, String name, int age, String address) {
		
		User user1 = this.getUser(userID);
		user1.setName(name);
		user1.setAge(age);
		user1.setAddress(address);
		
	}

	public Map<Integer, User> getAllUsers() {
		
	return users;
	}
	
	
}
