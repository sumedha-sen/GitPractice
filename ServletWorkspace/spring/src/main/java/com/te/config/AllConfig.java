package com.te.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({PetConfig.class,AnimalConfig.class})
@Configuration
public class AllConfig {
	

}
