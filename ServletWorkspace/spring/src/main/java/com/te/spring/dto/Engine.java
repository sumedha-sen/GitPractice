package com.te.spring.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class Engine implements Serializable{
	
//	public Engine() {
//		
//	}
	
	private int cc;
	private String engineType;
	
	
}
