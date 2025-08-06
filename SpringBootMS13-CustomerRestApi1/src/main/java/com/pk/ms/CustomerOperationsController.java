package com.pk.ms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperationsController {
	@GetMapping("/report")
	public ResponseEntity<String> showMsg(){
		return new ResponseEntity<String>("From the customer operations:",HttpStatus.OK);
	}
}
