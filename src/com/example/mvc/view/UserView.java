package com.example.mvc.view;

public class UserView implements View {
	
	@Override
	public String getSuccessMessage() {
		return "Success";
	}
	
	@Override
	public String getFailureMessage() {
		return "Failure";
	}
}
