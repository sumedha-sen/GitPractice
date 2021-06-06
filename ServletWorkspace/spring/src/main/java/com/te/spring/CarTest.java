package com.te.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.dto.Car;

public class CarTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("carConfig.xml");
		Car car=(Car) context.getBean("car");
		System.out.println(car.getBrand());
		System.out.println(car.getModel());
		System.out.println(car.getEngine().getCc());
		System.out.println(car.getEngine().getEngineType());
		
//		car.getBrand();
//		car.getModel();
//		car.getEngine().getCc();
//		car.getEngine().getEngineType();
//		
//		System.out.println(car);
		
	}

}
