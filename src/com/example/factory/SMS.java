package com.example.factory;

public class SMS implements MessageService {
	@Override
	public String sendMessage(String message) {
		StringBuilder stringBuilder = new StringBuilder("SMS: ");
		stringBuilder.append(message);
		return stringBuilder.toString();
	}
}
