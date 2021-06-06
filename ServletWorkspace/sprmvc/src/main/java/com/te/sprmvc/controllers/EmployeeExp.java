package com.te.sprmvc.controllers;

public class EmployeeExp extends RuntimeException {
	
	String msg;
	
	public EmployeeExp(String msg) {
		super(msg);
		this.msg=msg;
		
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}

}
