package com.pk.ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchServiceController {
	@GetMapping("/display")
	public String displayMessage() {
		return "Welcome to Flipkart search service";
	}
}
