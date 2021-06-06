package com.tyss.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee implements Serializable{
	
	public Employee() {
		
	}
	
	private int id;
	private String name;

}
