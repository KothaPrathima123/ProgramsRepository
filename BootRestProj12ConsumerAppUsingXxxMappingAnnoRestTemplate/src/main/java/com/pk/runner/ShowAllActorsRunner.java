package com.pk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
//@Component
public class ShowAllActorsRunner implements CommandLineRunner{
	@Autowired
	RestTemplate template;
	@Override
	public void run(String... args) throws Exception {
		String serviceUrl="http://localhost:4041/actor-api/all";
		/*//use getForEntity(-,-) method
		ResponseEntity<String> response=template.getForEntity(serviceUrl,String.class);
		//process the response
		System.out.println(response.getBody()+" "+response.getHeaders()+"  "+response.getStatusCode().value());
	*/
		//use getForObject(-,-)
	String result=template.getForObject(serviceUrl, String.class);
	System.out.println(result);
	
	
	
	}
	
		
}
