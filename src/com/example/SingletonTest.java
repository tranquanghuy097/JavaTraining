package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void test() throws NoSuchMethodException {
		Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
		assertTrue(Modifier.isPrivate(constructor.getModifiers()), "Constructor is not private");
	}

}
