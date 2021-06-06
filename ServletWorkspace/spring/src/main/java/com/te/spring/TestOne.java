package com.te.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.config.EmpConfig;


import com.te.spring.dto.EmployeeBean1;

/**
 * Hello world!
 *
 */
public class TestOne 
{
    public static void main( String[] args )
    {
      ApplicationContext context=
    		  new AnnotationConfigApplicationContext(EmpConfig.class);
     // EmployeeBean bean=context.getBean(EmployeeBean.class);
      EmployeeBean1 bean=context.getBean(EmployeeBean1.class);
      System.out.println(bean.getId());
      System.out.println(bean.getName());
      System.out.println(bean.getDept().getDId());
      System.out.println(bean.getDept().getDName());
      
     
      
    //System.out.println(bean);
      
    }
}
