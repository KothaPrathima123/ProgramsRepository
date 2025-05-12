package com.pk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cust")
@RestController
public class CustomerOperationsController {
	
	@Value("${dbuser}")
	private String user;
	@Value("${dbpwd}")
	private String pwd;
	@GetMapping("/display")
	public String displayData() {
		return "(Customer)Data collected through config server "+user+" "+pwd;
	}
}
