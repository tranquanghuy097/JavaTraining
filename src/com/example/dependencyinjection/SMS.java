package com.example.dependencyinjection;

public class SMS implements MessageService {
	@Override
	public String SendMessage(String Message) {
		StringBuilder stringbuilder = new StringBuilder("SMS: ");
		stringbuilder.append(Message);
		return stringbuilder.toString();
	}
	
}
