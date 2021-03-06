package com.te.springrestproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.springrestproj.beans.EmployeeBean;
import com.te.springrestproj.service.EmpService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	EmpService service;
	
	@GetMapping(path="/getEmp", produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public EmployeeBean getEmployee(int id) {
		EmployeeBean bean=service.getEmployee(id);
		if(bean!= null) {
			
			return bean; 
			
			
		}else {
			return null;
		}
		
		
	}

}
