package com.pk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class UpdateActorRemunerationByIdRunner implements CommandLineRunner{

	@Autowired
	private RestTemplate temp;
	@Override
	public void run(String... args) throws Exception {
		String serviceUrl="http://localhost:4041/actor-api/rupdate/{aid}/{amount}";
		temp.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		//use patchForObject(-,-) method
		ResponseEntity<String> resp=temp.exchange(serviceUrl, HttpMethod.PATCH, null,String.class, 952,75432.0);
		System.out.println(resp.getBody()+" "+resp.getStatusCodeValue()+" "+resp.getHeaders()+" "+resp.getStatusCode());
	System.exit(0);
	}

}
