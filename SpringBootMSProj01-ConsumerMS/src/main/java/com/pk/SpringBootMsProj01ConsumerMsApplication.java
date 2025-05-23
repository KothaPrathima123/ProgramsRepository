package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMsProj01ConsumerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj01ConsumerMsApplication.class, args);
	}

}
