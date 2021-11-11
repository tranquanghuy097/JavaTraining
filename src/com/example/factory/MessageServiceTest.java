package com.example.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MessageServiceTest {
	String message = "Hello World";
	
	@Test
	void testSMS() {
		SMS sms = new SMS();
		assertEquals(sms.sendMessage(message), "SMS: " + message);
	}
	
	@Test
	void testEmail() {
		Email email = new Email();
		assertEquals(email.sendMessage(message), "Email: " + message);
	}
	
	@Test
	void testFactory() {
		MessageService service = MessageServiceFactory.getService(Service.SMS);
		assertEquals(service.sendMessage(message), "SMS: " + message);
		service = MessageServiceFactory.getService(Service.EMAIL);
		assertEquals(service.sendMessage(message), "Email: " + message);
	}

}
