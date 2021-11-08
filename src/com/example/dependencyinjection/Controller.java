package com.example.dependencyinjection;

public class Controller {
	private MessageService service;
	
	public Controller(MessageService messageService) {
		service = messageService;
	}
	
	public String sendMessage(String Message) {
		return service.SendMessage(Message);
	}
	
	public void SwitchService(MessageService messageService) {
		service = messageService;
	}
}
