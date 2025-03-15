package com.pk.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pk.entity.Customer;

@Controller
class CustomerOperationsCotroller{
	@GetMapping("/")
	public String register() {
		return "welcome";
	}
	@GetMapping("/register")
	public String registerEmployee(@ModelAttribute("cust") Customer cust,Map<String,Object> map) {
		
		return "customer_register";
	}
	
	
}