package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentOperationsController {
	
	/*
	 * @GetMapping("/data") public String process(@RequestParam("sno") int
	 * no,@RequestParam String sname) { System.out.println(no+" "+sname); return
	 * "show_result"; }
	 */
	
	  @GetMapping("/data") public String process(@RequestParam int
	  sno,@RequestParam String sname) { System.out.println(sno+" "+sname); return
	  "show_result"; }
	 
	






}
