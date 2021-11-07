package com.example;

public class Singleton {
	private static Singleton INSTANCE;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
	
	public String getMessage() {
		return "Success!";
	}
}
