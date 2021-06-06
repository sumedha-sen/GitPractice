package com.te.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.te.config.MessageConfig;
import com.te.spring.dto.Message;

public class MsgTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MessageConfig.class);
     Message bean=context.getBean(Message.class);
      System.out.println(bean.getMsg());
      ((AbstractApplicationContext)context).close();
	}
	
	

}
