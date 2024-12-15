package com.lcwd.rating.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException() {
		super("resource not forund on server");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
	
	

}
