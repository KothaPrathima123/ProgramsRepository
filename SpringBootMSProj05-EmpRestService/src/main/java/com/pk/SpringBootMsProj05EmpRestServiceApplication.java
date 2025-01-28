package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootMsProj05EmpRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj05EmpRestServiceApplication.class, args);
	}

}
