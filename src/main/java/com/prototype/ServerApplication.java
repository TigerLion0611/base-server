package com.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class ServerApplication implements HealthIndicator {	
	
    public static void main( String[] args ) {
    	SpringApplication.run(ServerApplication.class, args);
    }
    
    @Override
	public Health health() {
		return Health.up().withDetail("author", "youzidata").build(); 
	}
    
    private CorsConfiguration buildConfig() {  
        CorsConfiguration corsConfiguration = new CorsConfiguration();  
        corsConfiguration.addAllowedOrigin("*"); 
        corsConfiguration.addAllowedHeader("*"); 
        corsConfiguration.addAllowedMethod("*");  
        return corsConfiguration;  
    }      
    
    @Bean  
    public CorsFilter corsFilter() {  
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
        source.registerCorsConfiguration("/**", buildConfig());  
        return new CorsFilter(source);  
    }  
}
