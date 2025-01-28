package com.pk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/test-operations")
@Controller
public class TestController {
	@GetMapping("/all")
	public String getAllTestsData() {
		System.out.println("TestController.getAllTestsData()");
		return "show_report1";
	}
}
