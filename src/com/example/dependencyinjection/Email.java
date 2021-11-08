package com.example.dependencyinjection;

public class Email implements MessageService {
	@Override
	public String SendMessage(String Message) {
		StringBuilder stringBuilder = new StringBuilder("Email: ");
		stringBuilder.append(Message);
		return stringBuilder.toString();
	}

}
