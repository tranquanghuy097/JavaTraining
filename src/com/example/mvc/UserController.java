package com.example.mvc;

import com.example.mvc.model.Model;
import com.example.mvc.model.UserModel;
import com.example.mvc.resource.User;
import com.example.mvc.view.UserView;
import com.example.mvc.view.View;

public class UserController implements Controller {
	Model model;
	View view;
	
	public UserController(UserModel model, UserView view) {
		this.model = model;
		this.view = view;
	}
	
	public String logIn(User user) {
		String message = model.ifExists(user) == true? view.getSuccessMessage() : view.getFailureMessage();
		return message;
	}
	
	public String signUp(User user) {
		String message = model.add(user) == true? view.getSuccessMessage() : view.getFailureMessage();
		return message;
	}
}
