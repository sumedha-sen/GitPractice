package com.te.sprmvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeControllerAdvice {
	
	@ExceptionHandler(EmployeeExp.class)
	public String handlerexp( EmployeeExp exp, HttpServletRequest req) {
		req.setAttribute("err",exp.getMessage());
		return "errPage";
		
		
	}
	

}
