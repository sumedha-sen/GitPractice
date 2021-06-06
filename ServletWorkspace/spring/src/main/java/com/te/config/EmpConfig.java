package com.te.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.spring.dto.EmployeeBean1;

@Import({DeptConfig.class})
@Configuration
public class EmpConfig {
	
	@Bean
	public EmployeeBean1 getEmpBean() {
		EmployeeBean1 bean=new EmployeeBean1();
		bean.setId(300);
		bean.setName("Sumedha");
		//bean.setDept(new Department());
		return bean;
	}

}
