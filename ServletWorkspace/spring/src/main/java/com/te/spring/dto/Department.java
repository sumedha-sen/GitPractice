package com.te.spring.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Department implements Serializable {
	
	private int dId;
	private String dName;
	public Department() {
		
	}
	

}
