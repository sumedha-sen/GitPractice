package com.tyss.jdbcapp;

import java.util.Date;

public class EmployeeDetails {
	
	int id;
	String name;
	Date dob;
	long phoneno;
	
	public EmployeeDetails() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", dob=" + dob + ", phoneno=" + phoneno + "]";
	}

	
	

}
