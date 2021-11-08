package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void testConstructorIsPrivate() throws NoSuchMethodException {
		Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
		assertTrue(Modifier.isPrivate(constructor.getModifiers()), "Constructor is not private");
	}
	
	@Test
	void testGetMessage() {
		Singleton singleton = Singleton.getInstance();
		assertEquals(singleton.getMessage(), "Success!");
	}
	
	@Test
	void testOnlyOneInstance() {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		assertSame(singleton, singleton2, "More than one instance");
	}

}
