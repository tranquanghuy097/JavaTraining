package com.example.mvc.model;

import java.util.List;

import com.example.mvc.resource.Resource;
import com.example.mvc.resource.User;

public class UserModel implements Model {
	List<User> userList;
	
	private UserModel() {
	}
	
	private UserModel(List<User> userList) {
		this.userList = userList;
	}
	
	@Override
	public boolean ifExists(Resource resource) {
		return false;
	}
}
