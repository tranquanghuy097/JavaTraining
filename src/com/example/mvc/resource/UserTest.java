package com.example.mvc.resource;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void testName() {
		String name = "John";
		User user = new User(name, "kas");
		assertEquals(user.getName(), name, "Inccorect name");
	}
	
	@Test
	void testPassword() {
		String hashedPassword = "John";
		User user = new User("asd", hashedPassword);
		assertEquals(user.getHashedPassword(), hashedPassword, "Inccorect hashed password");
	}
	
	@Test
	void testEqual() {
		User user1 = new User("asd", "asd");
		User user2 = new User("asd", "asd");
		assertEquals(user1, user2, "The override equals method is inccorect");
	}

}
