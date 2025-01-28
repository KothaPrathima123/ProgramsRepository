package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class SpringBootMsProj05EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj05EurekaServerApplication.class, args);
	}

}
