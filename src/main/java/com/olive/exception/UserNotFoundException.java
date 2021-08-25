package com.olive.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class UserNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	
	public UserNotFoundException() {
		super();
	}
	
	public UserNotFoundException(String s) {
		super(s);
	}
	

}
