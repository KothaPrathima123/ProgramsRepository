package com.pk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOperationsController {
	/*
	 * @GetMapping("/report") public String reportData(@RequestParam("cno") Integer
	 * no,@RequestParam String cname) { return no+" "+cname; }
	 
	@GetMapping("/report")
	public String reportData(@RequestParam("cno") Integer no,@RequestParam(required=false) String cname) {
		//default value of request param is true
		return no+" "+cname;
	}*/
	@GetMapping("/report")
	public ResponseEntity<String> reportData(@RequestParam("cno") Integer no,@RequestParam(required=false,defaultValue="king") String cname) {
		System.out.println(no+" "+cname);
		return new ResponseEntity<String> (no+" "+cname,HttpStatus.OK);//we can use defaultValue in combination with required attribute
	}
}
