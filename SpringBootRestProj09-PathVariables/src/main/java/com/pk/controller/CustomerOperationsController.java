package com.pk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOperationsController {
/*	@GetMapping("/report/{no}/{name}")
	public String fetchData(@PathVariable("name")String cname,@PathVariable Integer no) {*/
/*
 * @GetMapping("/report/{no}/{name}") public String
 * fetchData(@PathVariable("name")String cname,@PathVariable String no) { return
 * no+"<---->"+cname;//valid we have taken both as string values wrong vlue is
 * stored and b logic is disturbed }
 *///if we give extra/more or less path variable values 
		//"timestamp": "2024-08-30T08:41:48.972+00:00",
	    //"status": 404,
	    //"error": "Not Found",
/*
 * @GetMapping("/report/{no}/{name}") public String
 * fetchData(@PathVariable("name")String cname,@PathVariable Integer no) {
 * return no+"<---->"+cname;//more or less we get 404 error }
 */
	@GetMapping("/report/{no}/{name}")
	public String fetchData(@PathVariable(name="name",required=false)String cname,@PathVariable(required=false) Integer no) {
		return no+"<---->"+cname;//404 if no of levels in request path are 3 and we are giving only 2so it says resource not found for report/101
	//404	if no of levels in request path are 3 and we are giving only 2so it says resource not found for report , defaultValue param is not there in @PathVariable
		
	}

}
