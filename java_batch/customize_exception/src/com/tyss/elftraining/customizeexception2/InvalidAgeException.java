package com.tyss.elftraining.customizeexception2;

public class InvalidAgeException extends Exception {

	String msg;

	public InvalidAgeException() {

	}

	public InvalidAgeException(String msg) {
		super();
		this.msg = msg;

	}

	@Override
	public String getMessage() {
		return this.msg;
	}
	
	
	
	

}
