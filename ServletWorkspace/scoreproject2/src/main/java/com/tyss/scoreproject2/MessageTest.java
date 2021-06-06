package com.tyss.scoreproject2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.scoreproject2.bean.MessageBean;

public class MessageTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Message.xml");
		((ConfigurableApplicationContext) context).registerShutdownHook();//when jvm will shut down
		MessageBean bean=(MessageBean) context.getBean("message");
		System.out.println(bean.getMsg());
	
		


	}

}
