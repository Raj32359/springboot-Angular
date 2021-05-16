package com.ayvan.springbootwithangular.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 883207425433360442L;

	public UserNotFoundException(String message) {
		super(message);
	}

}
