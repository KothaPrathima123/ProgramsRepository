package com.pk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")
public class CustomerOperationsController {
	@GetMapping("/display")
	public String displayData() {
		return "(Customer)customer info will be displayed here.. welcome call  center";
	}
}
