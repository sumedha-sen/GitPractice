package com.tyss.springproj;

public class Test {

	public static void main(String[] args) {
		
		EmployeeAddressInfo  address=new EmployeeAddressInfo();
		address.setAddress1("indiranagar");
		address.setCity("Bangalore");
		address.setDoorNo(20);
		address.setState("Karnataka");
		address.setPincode(560017);
	
       
		EmployeePrimaryInfo  employeePrimaryInfo =new EmployeePrimaryInfo();
		employeePrimaryInfo.setEid(100);
		employeePrimaryInfo.setName("Sara");
		employeePrimaryInfo.setEmail("sara@gmail.com");
		
		employeePrimaryInfo.setAddress(address);
		
		

	}

}
