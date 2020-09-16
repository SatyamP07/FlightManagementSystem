package com.example.application.exceptions;

public class InvalidPasswordException extends RuntimeException {
	
	public InvalidPasswordException(String message) {
		super(message);
	}
}
