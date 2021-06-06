package com.te.spring.dto;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.Data;
@Data
public class Message implements Serializable{
	
	public Message() {
		System.out.println("insta phase");
	}
	
	private String msg;
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}

}
