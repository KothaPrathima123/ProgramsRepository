package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootActuatorsProj02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorsProj02Application.class, args);
	}

}
