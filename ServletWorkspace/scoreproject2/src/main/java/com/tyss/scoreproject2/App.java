package com.tyss.scoreproject2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.scoreproject2.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("allimport.xml");
        Employee employee=(Employee) context.getBean("emp");
        
    
        
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getDept().getDId());
        System.out.println(employee.getDept().getDname());
        
        
        
    }
}
