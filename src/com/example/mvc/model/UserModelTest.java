package com.example.mvc.model;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

class UserModelTest {

	@Test
	void testConstructorIsPrivate() throws NoSuchMethodException {
		Constructor<UserModel> constructor = UserModel.class.getDeclaredConstructor();
		assertTrue(Modifier.isPrivate(constructor.getModifiers()), "Constructor is not private");
	}

}
