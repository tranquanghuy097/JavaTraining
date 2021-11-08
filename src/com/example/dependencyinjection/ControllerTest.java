package com.example.dependencyinjection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ControllerTest {

	@Test
	void testSendSMS() {
		MessageService service = new SMS();
		Controller controller = new Controller(service);
		assertEquals(controller.sendMessage("Hello"), "SMS: Hello");
	}
	
	@Test
	void testSendEmail() {
		MessageService service = new Email();
		Controller controller = new Controller(service);
		assertEquals(controller.sendMessage("Hello"), "Email: Hello");
	}
	
	@Test
	void testSwitchService() {
		MessageService sms = new SMS();
		Controller controller = new Controller(sms);
		assertEquals(controller.sendMessage("Hello"), "SMS: Hello");
		
		MessageService email = new Email();
		controller.SwitchService(email);
		assertEquals(controller.sendMessage("Hello"), "Email: Hello");
	}

}
