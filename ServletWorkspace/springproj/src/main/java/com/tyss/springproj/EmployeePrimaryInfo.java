package com.tyss.springproj;




public class EmployeePrimaryInfo {
	private int eid;
	private String name;
	private String email;
	private EmployeeAddressInfo address;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public EmployeeAddressInfo getAddress() {
		return address;
	}
	public void setAddress(EmployeeAddressInfo address) {
		this.address = address;
	}
	
	//private EmployeeAddressInfo address;
	
	
	
	

}
