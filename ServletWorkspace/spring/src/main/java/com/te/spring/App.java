package com.te.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.config.EmployeeConfig;
import com.te.spring.dto.EmployeeBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=
    		  new AnnotationConfigApplicationContext(EmployeeConfig.class);
     // EmployeeBean bean=context.getBean(EmployeeBean.class);
      EmployeeBean bean=context.getBean("two",EmployeeBean.class);
     // System.out.println(bean);
//      bean.setId(100); EmployeeBean bean=context.getBean(EmployeeBean.class);
//      bean.setName("sara");
      System.out.println(bean);
      
    }
}
