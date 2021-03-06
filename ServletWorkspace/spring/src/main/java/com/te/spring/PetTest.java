package com.te.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.config.AllConfig;
import com.te.config.EmpConfig;

import com.te.spring.dto.Pet;

public class PetTest {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);

		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().eat();
		pet.getAnimal().speak();
		

	}
}
