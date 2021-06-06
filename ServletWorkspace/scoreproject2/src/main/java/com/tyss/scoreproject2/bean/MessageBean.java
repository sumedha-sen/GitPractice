package com.tyss.scoreproject2.bean;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class MessageBean implements Serializable,InitializingBean,DisposableBean{
	
	public MessageBean() {
		System.out.println("Insta phase");
		
	}
	
	String msg;

	@Override
	public void destroy() throws Exception {
		System.out.println("inside init phase");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside destroy phase");
		// TODO Auto-generated method stub
		
	}

}
