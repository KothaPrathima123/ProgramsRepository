package com.pk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish")
public class WishMessageService {
	@GetMapping("/provider")
	public String wishMessage() {
		return "wish message provider";
	}
}
