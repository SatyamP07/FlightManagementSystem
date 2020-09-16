package com.example.application.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class RegisterLoginModuleExceptionHandler {

	@ExceptionHandler({UserNotFoundException.class})
	public ResponseEntity<String> handleException(UserNotFoundException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler({InvalidPasswordException.class})
	public ResponseEntity<String> handleException(InvalidPasswordException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
