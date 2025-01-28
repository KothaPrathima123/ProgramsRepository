package com.pk.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingOperationsController {
	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	@GetMapping("/show-bill/{billNo}")
	public ResponseEntity<String> doBilling(@PathVariable int billNo) {
		System.out.println("BillingServiceController.doBilling()..."+instanceId);
		int billAmt=new Random().nextInt(2000000);
		return new ResponseEntity<String>(instanceId+"..billAmt for "+billNo+" is "+billAmt,HttpStatus.OK);
	}
}
