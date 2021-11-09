package com.example.mvc.view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserViewTest {

	@Test
	void testGetSuccessMessage() {
		View view = new UserView();
		assertEquals(view.getSuccessMessage(), "Success");
	}
	
	@Test
	void testGetFailureMessage() {
		View view = new UserView();
		assertEquals(view.getFailureMessage(), "Failure");
	}

}
