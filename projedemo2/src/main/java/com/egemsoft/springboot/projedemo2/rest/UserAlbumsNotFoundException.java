package com.egemsoft.springboot.projedemo2.rest;

public class UserAlbumsNotFoundException extends RuntimeException{

	public UserAlbumsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	
	}

	public UserAlbumsNotFoundException(String message) {
		super(message);
		
	}

	public UserAlbumsNotFoundException(Throwable cause) {
		super(cause);
		
	}

	
	
}
