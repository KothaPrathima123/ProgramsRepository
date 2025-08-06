package com.pk.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class ActorServiceConsumerRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		RestTemplate template=new RestTemplate();
		String serviceUrl="http://localhost:8080/actor/wish";
		ResponseEntity<String> response=template.getForEntity(serviceUrl,String.class);
		//display the received details from response
		System.out.println("Response Body(url): "+response.getBody());
		System.out.println("Response status code value: "+response.getStatusCodeValue());
		System.out.println("Response status code: "+response.getStatusCode().value());
	}

}
