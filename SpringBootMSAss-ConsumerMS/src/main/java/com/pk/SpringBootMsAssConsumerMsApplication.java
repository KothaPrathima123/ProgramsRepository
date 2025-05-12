package com.pk;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootMsAssConsumerMsApplication {
	    @Bean
	    public LocalDateTime localDateTime() {
	        return LocalDateTime.now(); // or any other initialization logic
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsAssConsumerMsApplication.class, args);
	}
}
