package com.te.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.spring.dto.EmployeeBean;

@Configuration
public class EmployeeConfig {
	
	@Bean(name="one")
	//@Primary
	public EmployeeBean getEmployeeBean() {
		return new EmployeeBean();
	}
	
	@Bean(name="two")
	//@Primary
	public EmployeeBean getEmp() {
		EmployeeBean bean=new EmployeeBean(100,"Tara");
		return bean;
		
	}
	
	@Bean(name="three")
	@Primary
	public EmployeeBean getEmployee() {
		EmployeeBean bean=new EmployeeBean();
		bean.setId(200);
		bean.setName("Tara");
		return bean;
		
	}

}
