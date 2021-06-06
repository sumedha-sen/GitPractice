package com.te.spring.dto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;


@Data
public class Car implements Serializable {
	
//	public Car() {
//		
//	}
	
	private String brand;
	
	private String model;
	
	@Autowired(required=false)
	private Engine engine;
	

}
