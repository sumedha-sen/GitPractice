package com.tyss.springcoreproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		     Employee employee=(Employee) context.getBean("employeeObject");
		     System.out.println(employee.getId());
		     System.out.println(employee.getName());
		     

	}

}
