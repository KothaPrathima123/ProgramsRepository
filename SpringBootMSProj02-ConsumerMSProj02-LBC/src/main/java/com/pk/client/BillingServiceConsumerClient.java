package com.pk.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumerClient {
	@Autowired
	private LoadBalancerClient client;
	public String getBillingInfo() {
		ServiceInstance instance=client.choose("Billing-Service");
	//get details from service instance
		URI uri=instance.getUri();
		//prepare provider MS releated url to consume method
		String url=uri.toString()+"/billing/api/info";
	RestTemplate template=new RestTemplate();
	//consume the provider service
	ResponseEntity<String> response=template.getForEntity(url, String.class);
	//get respnse content from ResponseEntity Obj
	String responseContent=response.getBody();
	return responseContent;
	
	}
}
