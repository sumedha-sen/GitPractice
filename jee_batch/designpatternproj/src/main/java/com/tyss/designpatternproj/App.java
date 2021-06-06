
package com.tyss.designpatternproj;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.tyss.designpatternproj.dao.EmployeeDetailsDAO;
import com.tyss.designpatternproj.dto.Primary_Info;
import com.tyss.designpatternproj.factory.EmployeeFactory;
import com.tyss.designpatternproj.service.EmployeeService;
import com.tyss.designpatternproj.service.EmployeeServiceJdbc;

public class App {
	public static void main(String[] args) {
		
	//EmployeeService employeeService=new EmployeeServiceJdbc();
	Scanner scanner = new Scanner(System.in);
	EmployeeFactory employeeFactory = new EmployeeFactory();

   //EmployeeDetailsDAO employeeDetailsDAO = employeeFactory.getEmployee();
     EmployeeService imp=new EmployeeServiceJdbc();
	int iterate;
	do {
	System.out.println("enter 1 to see all records");
	System.out.println("enter 2 to fetch perticular employee data");
	System.out.println("enter 3 update employee data");
	System.out.println("enter 4 delete employee data");
	System.out.println("enter 5 insert employee data");
	int number = scanner.nextInt();
	if (number == 1) {
		
		List<Primary_Info> infos=  imp.getAllRecords();
		for (Primary_Info iPrimary_Info : infos) {
			//System.out.println(primary_info);
			System.out.println(iPrimary_Info.getId());
			System.out.println(iPrimary_Info.getName());
			
			System.out.println(iPrimary_Info.getDob());
			System.out.println(iPrimary_Info.getPhoneno());
		}

	} else if (number == 2) {
	System.out.println("enter id to see records ");
	int id = scanner.nextInt();
	Primary_Info iPrimary_Info = imp.getSingleRecord(id);
	System.out.println(iPrimary_Info.getId());
	System.out.println(iPrimary_Info.getName());
	System.out.println(iPrimary_Info.getDob());
	System.out.println(iPrimary_Info.getPhoneno());
	} else if (number == 3) {
	System.out.println("enter id to update records ");
	
	int id = scanner.nextInt();
	imp.updateRecord(id);
	} else if (number == 4) {
	System.out.println("enter id to delete records ");
	int id = scanner.nextInt();
	imp.deleteRecord(id);
	} else if (number == 5) {

	try {
	Primary_Info info = new Primary_Info();
	System.out.println("enter id");
	int id = scanner.nextInt();
	System.out.println("enter name");
	String name = scanner.next();
	System.out.println("enter dob");
	String dateString = scanner.next();
	Date date = new Date(new SimpleDateFormat("dd/MM/yyyy").parse(dateString).getTime());
	System.out.println("enter phone no");
	long phone = scanner.nextLong();
	info.setId(id);
	info.setName(name);
	info.setDob(date);
	info.setPhoneno(phone);
	imp.insertRecord(info);
	} catch (Exception e) {

	e.printStackTrace();
	}

	} else {
	System.out.println("enter correct operation");
	}

	System.out.println("enter 1 to repeat");
	System.out.println("enter other than 1 to quit");
	iterate = scanner.nextInt();
	} while (iterate == 1);
	scanner.close();
	
	



	
		
		
	//------------------------------------------------------------------	
		
//		 Service dao= new EmployeeServiceJdbcImpl();
//		 
//		 PrimaryInfo info=dao.getSingleRecord();
//		 
//		 System.out.println(info.getName());
//		 System.out.println(info.getPhoneNumber());
//		 
//		
//	}
		
		
		
//-----------------------------------------------------------
		//EmployeeFactory employeeFactory = new EmployeeFactory();//start

		//EmployeeDetailsDAO employeeDetailsDAO = employeeFactory.getEmployee();
//		Primary_Info pInfo = new Primary_Info();// _____inserting
//		try {
//			pInfo.setId(31); 
//			pInfo.setName("sumedh");
//			Date date = new Date(new SimpleDateFormat("dd/MM/yyyy").parse("07/04/1999").getTime());
//			pInfo.setDob(date);
//			pInfo.setPhoneno(8978986801l);
//
//			employeeDetailsDAO.insertRecord(pInfo);
//		} catch (ParseException e) {
//
//			e.printStackTrace();
//		}//finish

	}
}

