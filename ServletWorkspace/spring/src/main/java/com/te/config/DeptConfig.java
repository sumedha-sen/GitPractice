package com.te.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.spring.dto.Department;
import com.te.spring.dto.EmployeeBean1;

@Configuration
public class DeptConfig {
	
	
	
	@Bean
//	@Primary
	public Department getEmpBean() {
		Department bean=new Department();
		bean.setDId(10);
		bean.setDName("Dev");
		
		return bean;
	}
	
	
	
//	@Bean(name="two")
//	public Department getEmpBean1() {
//		Department bean=new Department();
//		bean.setDId(20);
//		bean.setDName("HR");
//		
//		//bean.setDept(new Department());
//		return bean;
//	}
//	
//	@Bean
//	public Department getEmpBean2() {
//		Department bean=new Department();
//		bean.setDId(30);
//		bean.setDName("Test");
//		
//		//bean.setDept(new Department());
//		return bean;
//	}

}
