package com.example.mvc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.mvc.model.UserModel;
import com.example.mvc.resource.User;
import com.example.mvc.view.UserView;

class ControllerTest {
	static UserModel model;
	static UserView view;
	static List<User> userList = new ArrayList<User>();
	static UserController controller;
	
	static {
		userList.add(new User("Huy", "asde"));
		userList.add(new User("Jack", "zxc"));
		userList.add(new User("Jill", "sad"));
		userList.add(new User("James", "qwe"));
		
		model = mockUpDatabase();
		view = new UserView();
		
		controller = new UserController(model, view);
	}
	
	static UserModel mockUpDatabase() {
		UserModel mockUp = UserModel.getInstance();
		userList.forEach((user) -> {
			mockUp.addUser(user);
		});
		return mockUp;
	}

	@Test
	void testLogInSuccess() {
		assertEquals(controller.logIn(userList.get(1)), "Success");
	}
	
	@Test
	void testLogInFailure() {
		assertEquals(controller.logIn(new User("kameas", "Asdasd")), "Failure");
	}

}
