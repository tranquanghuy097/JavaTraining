package com.example;

public class Singleton {
	private static Singleton INSTANCE;

	private Singleton() {
		throw new AssertionError("Constructor is private");
	}

	public static Singleton GetInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
}
