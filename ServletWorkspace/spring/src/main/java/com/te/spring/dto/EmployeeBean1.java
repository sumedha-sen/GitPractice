package com.te.spring.dto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class EmployeeBean1 implements Serializable {
	private int id;
	private String name;
	
	@Autowired(required=false)
	//@Qualifier("two")
	private Department dept;
	
	public EmployeeBean1() {
		
	}
	
}

