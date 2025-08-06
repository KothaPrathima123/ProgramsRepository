package com.pk;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling//enables spring scheduled task execution capability
public class BootSchedulingProj3Application {

	public static void main(String[] args) {
		SpringApplication.run(BootSchedulingProj3Application.class, args);
	System.out.println("App started at:: "+new Date());
	}

}
