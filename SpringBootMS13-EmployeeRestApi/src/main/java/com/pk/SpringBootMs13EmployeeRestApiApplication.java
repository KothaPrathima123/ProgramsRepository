package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMs13EmployeeRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMs13EmployeeRestApiApplication.class, args);
	}

}
