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
	
	@Override
	public boolean add(Resource resource) {
		try {
			User user = (User) resource;
			userList.add(user);
		} catch (Exception e) {
			return false;
		} 
		return true;
	}
	
	@Override
	public boolean ifExists(Resource resource) {
		User user = (User) resource;
		return userList.contains(user);
	}
	
	@Override
	public void reset() {
		userModel = null;
	}
}
