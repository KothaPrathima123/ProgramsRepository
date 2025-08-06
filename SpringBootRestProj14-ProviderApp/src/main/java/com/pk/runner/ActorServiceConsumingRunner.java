package com.pk.runner;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class ActorServiceConsumingRunner implements CommandLineRunner{
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("ActorServiceConsumingRunner.run()");
		//create RestTemplate class obj
		RestTemplate temp=new RestTemplate();
		String serviceUrl="http://localhost:4042/actor/wish";
		ResponseEntity<String> resp=temp.exchange(serviceUrl,HttpMethod.GET, null,String.class);
		System.out.println(resp.getBody()+" "+resp.getStatusCode()+" "+resp.getStatusCodeValue()+" "+resp.getHeaders());
	}

}
