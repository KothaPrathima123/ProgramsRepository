package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMs13CloudGatewayMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMs13CloudGatewayMs1Application.class, args);
	}

}
