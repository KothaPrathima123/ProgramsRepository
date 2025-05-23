package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootMS02EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMS02EurekaServerApplication.class, args);
	}

}
