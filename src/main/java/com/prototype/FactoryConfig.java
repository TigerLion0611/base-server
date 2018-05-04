package com.prototype;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
@EnableAutoConfiguration
public class FactoryConfig {	
	 
    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor(){
    	return new MethodValidationPostProcessor();
    }
    
}
