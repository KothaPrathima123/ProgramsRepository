package com.pk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing/api")
public class BillingInfoController {
	@Value("${server.port}")
	private int port;
	@Value("${eureka.instance.instance-id}")
	private String instanceid;
	@GetMapping("/info")
	public ResponseEntity<String> fetchBillingDeatils(){
		return new ResponseEntity<String>("Final BillAmt=BillAmt-discount(rs. 5000):: using instance::->"+instanceid+" @port::"+port,HttpStatus.OK);
	}
	
	
}
