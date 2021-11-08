package com.example.mvc.model;

import java.util.ArrayList;
import java.util.List;

import com.example.mvc.resource.Resource;
import com.example.mvc.resource.User;

public class UserModel implements Model {
	private static UserModel userModel;
	private List<User> userList = new ArrayList<User>();
	
	private UserModel() {
	}
	
	public static UserModel getInstance() {
		if(userModel == null) {
			userModel = new UserModel();
		}
		
		return userModel;
	}
	
	public void addUser(User user) {
		userList.add(user);
	}
	
	@Override
	public boolean ifExists(Resource resource) {
		User user = (User) resource;
		return userList.contains(user);
	}
}
