package com.te.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.spring.Cat;
import com.te.spring.Dog;

@Configuration
public class AnimalConfig {
    
	@Bean
	public Dog getDog() {

		return new Dog();
	}
    
	@Bean
	@Primary
	public Cat getCat() {

		return new Cat();
	}

}
