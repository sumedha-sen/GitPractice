package com.te.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.spring.MyBeanFactoryPP;
import com.te.spring.dto.Message;

@Configuration
public class MsgConfig {
	
	@Bean
	public Message getMsgBean() {
		Message bean=new Message();
		bean.setMsg("Hi springcore...");
		return bean;
		
	}
	
	@Bean
	public MyBeanFactoryPP getBFPP() {
		return new  MyBeanFactoryPP(); 
	}
	
	

}
