package com.pk.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.client.IBillingMsClientComp;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/shopping-api")
public class ShoppingServiceOperationsController {
	@Autowired
	private IBillingMsClientComp clientComp;
	@GetMapping("/purchase")
	@CircuitBreaker(name="Shopping-Service",fallbackMethod="billingFallback")
	public ResponseEntity<String> doShopping(){
		//use client comp support to invoke provider MS service
		System.out.println("ShoppingServiceOperationsController.doShopping()");
		//return ResponseEntity obj from consumer MS
		String msg=" Shopping for dasara festival (shirt,trouser) is happening";
		int bNo=new Random().nextInt(100000);//consumer ms result
		ResponseEntity<String> response=clientComp.invokeDoBilling(bNo);
		String result=response.getBody();
		//prepare final result
		String finalResult=msg+"..."+result;
		return new ResponseEntity<String>(finalResult,HttpStatus.OK);//contains provider+consumer ms
	}
	public ResponseEntity<String> billingFallback(Exception e){
		System.out.println("ShoppingServiceOperationsController.billingFallback()");
		return new ResponseEntity<String>("Billing perations are out of Service",HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
