package com.te.spring.dto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class EmployeeBean implements Serializable {
	
	public EmployeeBean() {
		
	}
	
	private int id;
	private String name;
	
	
	

}
