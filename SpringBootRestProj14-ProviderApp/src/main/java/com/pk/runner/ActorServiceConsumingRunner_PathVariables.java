package com.pk.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
//@Component
public class ActorServiceConsumingRunner_PathVariables implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		RestTemplate template=new RestTemplate();
		String serviceUrl="http://localhost:4042/actor/wish/{id}/{name}";
		//genearete hhtprequset with GET mode to compare the web service(API)
		//ResponseEntity<String> response=template.getForEntity(serviceUrl, String.class,1001,"raja");
		ResponseEntity<String> response=template.exchange(serviceUrl, HttpMethod.GET,null,String.class,52,"wwwwwwwwwwww");
		//display the received detais fron the response
		System.out.println(response.getBody()+" "+response.getStatusCode()+" "+response.getHeaders().toString()+" "+response.getStatusCode());
		System.exit(0);//optional given to stop server automatically
	}
	
}
