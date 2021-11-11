package com.example.factory;

public class Email implements MessageService {
	@Override
	public String sendMessage(String message) {
		StringBuilder stringBuilder = new StringBuilder("Email: ");
		stringBuilder.append(message);
		return stringBuilder.toString();
	}
}
