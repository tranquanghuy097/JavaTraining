package com.example.mvc.model;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

import com.example.mvc.resource.User;

class UserModelTest {

	@Test
	void testConstructorIsPrivate() throws NoSuchMethodException {
		Constructor<UserModel> constructor = UserModel.class.getDeclaredConstructor();
		assertTrue(Modifier.isPrivate(constructor.getModifiers()), "Constructor is not private");
	}
	
	@Test
	void testOnlyOneInstance() {
		UserModel singleton = UserModel.getInstance();
		UserModel singleton2 = UserModel.getInstance();
		assertSame(singleton, singleton2, "More than one instance");
	}
	
	@Test
	void testSearchWhenListIsEmpty() {
		UserModel userModel = UserModel.getInstance();
		User user = new User("Jack", "jill");
		assertFalse(userModel.ifExists(user), "Fail to check for empty list");
	}
	
	UserModel createModel() {
		UserModel userModel = UserModel.getInstance();
		userModel.addUser(new User("Jack", "jill"));
		userModel.addUser(new User("Mark", "asd"));
		userModel.addUser(new User("Dean", "eqw"));
		userModel.addUser(new User("Cam", "xas"));
		return userModel;
	}
	
	@Test
	void testUserExist() {
		UserModel userModel = createModel();
		User user = new User("Jack", "jill");
		assertTrue(userModel.ifExists(user), "Fail to find already existing user");
	}
	
	@Test
	void testUserNotExist() {
		UserModel userModel = createModel();
		User user = new User("Gaia", "jill");
		assertFalse(userModel.ifExists(user), "Fail to detect that user does not exist");
	}

}
