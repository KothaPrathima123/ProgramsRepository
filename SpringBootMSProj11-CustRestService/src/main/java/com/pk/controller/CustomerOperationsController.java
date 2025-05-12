package com.pk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/cust")
public class CustomerOperationsController {
	
	@Value("${dbuser}")
	private String user;
	@Value("${dbpwd}")
	private String pwd;
	@GetMapping("/display")
	public String displayData() {
		return "(customer)data collected through config server:"+user+" "+pwd;
	}
	
}
