package com.pk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pk.bindings.ActorData;

//@Component
public class ShowActorByIdRunner implements CommandLineRunner{

	@Autowired
	private RestTemplate temp;
	@Override
	public void run(String... args) throws Exception {
	String serviceUrl="http://localhost:4041/actor-api/find/{aid}";
	ResponseEntity<String> resp=temp.exchange(serviceUrl,HttpMethod.GET,null,String.class,52);
	System.out.println(resp.getBody()+" "+resp.getStatusCode().value()+" "+resp.getHeaders());
	ObjectMapper mapper=new ObjectMapper();
	ActorData data=mapper.readValue(resp.getBody(),ActorData.class);
	System.out.println("json to obj data "+data);
	System.exit(0);
		
	}

}
