package com.pk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class DeleteActorByIdRunner implements CommandLineRunner{

	@Autowired
	private RestTemplate temp;
	@Override
	public void run(String... args) throws Exception {
		String serviceUrl="http://localhost:4041/actor-api/delete/{aid}";
		ResponseEntity<String> resp=temp.exchange(serviceUrl,HttpMethod.DELETE,null,String.class,952);
		System.out.println(resp.getBody()+" "+resp.getStatusCodeValue()+" "+resp.getStatusCode()+resp.getHeaders());
		System.exit(0);
		
	}

}
