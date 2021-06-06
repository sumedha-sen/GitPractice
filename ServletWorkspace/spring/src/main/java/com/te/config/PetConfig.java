package com.te.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.spring.dto.Pet;

@Configuration
public class PetConfig {
	
	@Bean
	public Pet getPet() {
		Pet pet=new Pet();
		pet.setName("charlie");
		return pet;
		
	}

}
