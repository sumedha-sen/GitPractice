package com.te.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.spring.dto.Message;

@Configuration
public class MessageConfig {

	@Bean
	public Message getMsg() {
		Message msg=new Message();
		msg.setMsg("hello");
		return msg;
		
		
	}
	
}
