package com.pk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class SaveActorRunner implements CommandLineRunner{

	@Autowired
	private RestTemplate temp;
	@Override
	public void run(String... args) throws Exception {
		String serviceUrl="http://localhost:4041/actor-api/save";
		String json_body="{\"aname\": \"jr.ntr\",\"addrs\":\"hyd\",\"remuneration\":546.9,\"active_SW\":\"active\"}";
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		//prepare Htpentity obj having headers and body
		HttpEntity<String> entity=new HttpEntity<String>(json_body,headers);
		//use postforentity(-,-) method
		ResponseEntity<String> resp=temp.exchange(serviceUrl, HttpMethod.POST,entity,String.class);
	System.out.println(resp.getBody()+" "+resp.getStatusCodeValue()+resp.getHeaders()+resp.getStatusCode());
	System.exit(0);
	}

}
