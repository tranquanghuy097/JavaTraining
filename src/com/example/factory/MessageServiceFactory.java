package com.example.factory;

public class MessageServiceFactory {

	private MessageServiceFactory() {
	}

	public static final MessageService getService(Service serviceType) {
		switch (serviceType) {
		case SMS:
			return new SMS();
		case EMAIL:
			return new Email();
		default:
			throw new IllegalArgumentException("This service type is unsupported");

		}
	}
}
