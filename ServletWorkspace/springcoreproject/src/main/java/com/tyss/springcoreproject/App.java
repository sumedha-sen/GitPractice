package com.tyss.springcoreproject;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
     Employee employee=(Employee) context.getBean("emp");
     Employee employee2=(Employee) context.getBean("employee");
     
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter name of First Employee");
     employee.setName(scanner.nextLine());
     
     System.out.println("Enter the id");
     String num=scanner.nextLine();
     int id=Integer.parseInt(num);
     employee.setId(id);
     
     System.out.println(employee);
     
     System.out.println("Enter name of Second Employee");
     employee2.setName(scanner.nextLine());
     
     System.out.println("Enter the id");
     String num1=scanner.nextLine();
     int id1=Integer.parseInt(num1);
     employee2.setId(id1);
     
     System.out.println(employee2);
     System.out.println(employee);
     
     
     
     
     
    }
}
