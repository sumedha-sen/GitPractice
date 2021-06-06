package com.tyss.ems2.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;


@Entity
@Table(name="primary_info")
public class Employee implements Serializable {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="phoneno")
	private long phoneno;

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
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", phoneno=" + phoneno + "]";
	}
	
}
	
	


