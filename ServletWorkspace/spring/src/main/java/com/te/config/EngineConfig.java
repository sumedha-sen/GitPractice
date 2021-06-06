package com.te.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.spring.dto.Engine;

@Configuration
public class EngineConfig {
	
	@Bean
	public Engine getEngine() {
		Engine eng=new Engine();
		eng.setCc(3000);
		eng.setEngineType("Diesel");
		
		return eng;
	}

}
