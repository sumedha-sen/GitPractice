package com.tyss.scoreproject2.bean;

import java.io.Serializable;

import lombok.Data;
@Data

public class Department implements Serializable{
	
	public Department() {
		
	}
	private int dId;
	private String dname;

}
