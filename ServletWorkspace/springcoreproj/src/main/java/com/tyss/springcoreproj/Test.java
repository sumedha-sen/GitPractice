package com.tyss.springcoreproj;




public class Test {
	
public static void main(String[] args) {
		
		EmpAddInfo  addrss=new EmpAddInfo();
		addrss.setAddress1("indiranagar");
		addrss.setCity("Bangalore");
		addrss.setDoorNo(20);
		addrss.setState("Karnataka");
		addrss.setPincode(560017);
	
       
		EmpPriInfo  employeePrimaryInfo =new EmpPriInfo();
		employeePrimaryInfo.setEid(100);
		employeePrimaryInfo.setName("Sara");
		employeePrimaryInfo.setEmail("sara@gmail.com");
		
		employeePrimaryInfo.setAdd(addrss);
		
		

	}

}
