package com.tyss.scoreproject2.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data

public class Employee implements Serializable  {
	
	public Employee() {
		
	}
	
	private int id;
	private String name;
	private Department dept;

}
