package com.pk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class UpdateActorRemuneration implements CommandLineRunner{
	@Autowired
	RestTemplate template;
	@Override
	public void run(String... args) throws Exception {
		String serviceUrl="http://localhost:4041/actor-api/rupdate/{id}/{amount}";
		template.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		//use patchForObject(-,-) method
		String result=template.patchForObject(serviceUrl, null,String.class,102, 456999.0);
		//process the response
		System.out.println("response body(result): "+result);
		System.exit(0);
	}

}
