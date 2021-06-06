package com.tyss.elftraining.customize_uncheckedexception;

public class MarksValidator extends RuntimeException{
	String msg;
	public MarksValidator() {
		super();
	}
	public MarksValidator(String msg) {
		super(msg);
		this.msg=msg;
	}
	public String getMessage() {
		return this.msg;
		
		
	}
	

}
