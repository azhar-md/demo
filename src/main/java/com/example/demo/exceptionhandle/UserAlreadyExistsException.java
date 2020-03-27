package com.example.demo.exceptionhandle;

public class UserAlreadyExistsException extends RuntimeException {

	private String message;

	public UserAlreadyExistsException(String message) {
		super(message);
		//this.message = message;
	}

}
