package com.lcwd.user.service.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	// setting default message
	public ResourceNotFoundException() {
		super("Resource not found on server !!");
	}
	
	// Customize message
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
