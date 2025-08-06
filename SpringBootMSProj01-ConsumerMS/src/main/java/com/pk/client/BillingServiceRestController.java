package com.pk.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestController {
	@Autowired
	private DiscoveryClient client;
	public String getBillingInfo() {
		List<ServiceInstance> listSI=client.getInstances("Billing-Service");
		ServiceInstance SI=listSI.get(0);
		String url=SI.getUri()+"/billing/info";
		RestTemplate template=new RestTemplate();
		String resp=template.getForObject(url, String.class);
		return resp;
	}
}
