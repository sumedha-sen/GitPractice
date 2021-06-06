package com.te.spring.dto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.interfaces.Animal;

import lombok.Data;

@Data
public class Pet implements Serializable {
	
	 private String name;
	 
	 @Autowired(required=false)
	 private Animal animal;
	

}
