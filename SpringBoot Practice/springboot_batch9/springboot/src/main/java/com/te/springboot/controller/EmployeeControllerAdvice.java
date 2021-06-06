package com.te.springboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.springboot.beans.EmployeeResponse;
import com.te.springboot.exp.EmployeeExp;

@RestControllerAdvice
public class EmployeeControllerAdvice {
	
	@ExceptionHandler(EmployeeExp.class)
	public EmployeeResponse handlerExp(EmployeeExp employeeexp) {
		EmployeeResponse response=new EmployeeResponse();
		response.setStatusCode(404);
		response.setMsg("Failure");
		response.setDescription("Data already present ...This is in adviser class");
		return response;
		
	}
	

}
