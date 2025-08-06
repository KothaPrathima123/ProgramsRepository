package com.pk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOperationsController {
	//we can use multiple request paths for the methods of restcontroller
	@GetMapping(value={"/report/{eno}/{ename}", "/report/{eno}"})
	public ResponseEntity<String> showReport2(@PathVariable(name="eno")String no,@PathVariable(required=false) String ename) {
		System.out.println(no+" "+ename);
		return new ResponseEntity<String>(no+" "+ename,HttpStatus.OK);
	}
	/*
	 * @GetMapping("/report/101/raja") public String
	 * fetchData5(@PathVariable(name="name",required=false)String
	 * cname,@PathVariable(required=false) Integer no) { return
	 * "form FetchData1";//if two methods of restcontroller is having same req path
	 * with same no of levels then there is possibility of getting
	 * IllegalStateException during server startup }
	 */
	
	/*
	 * @GetMapping("/report/no/{name}") public String
	 * fetchData2(@PathVariable(name="name",required=false)String
	 * cname,@PathVariable(required=false) String no) { return "form FetchData2";//2
	 * static one dynamic }
	 */
 
	/*
	 * @GetMapping("/report/{no}/{name}") public String
	 * fetchData3(@PathVariable(name="name",required=false)String
	 * cname,@PathVariable(required=false) Integer no) { return
	 * "form FetchData3";//one static two dynamic }
	 */
  
	/*
	 * @GetMapping("/report/{no}/name") public String
	 * fetchData(@PathVariable(name="name",required=false)String
	 * cname,@PathVariable(required=false) Integer no) { return "from FetchData4";
	 * //no is dynamic 2 static }
	 */


}
