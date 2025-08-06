package com.pk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class StudentOperationsController {
	
	/*
	 * @GetMapping("/data") public String process(@RequestParam("sno") int
	 * no,@RequestParam String sname) { System.out.println(no+" "+sname); return
	 * "show_result"; }//400 error not matching with method param
	 */
	
	/*
	 * @GetMapping("/data") public String process(@RequestParam int
	 * sno,@RequestParam(required=false) String sname) {
	 * System.out.println(sno+" "+sname); return "show_result"; }//no matching so
	 * null will be taken for sname
	 */
	/*
	 * @GetMapping("/data") public String process(@RequestParam (name="sno",
	 * defaultValue="2001") int no,
	 * 
	 * @RequestParam(defaultValue ="rrr") String sname) {
	 * System.out.println(no+" "+sname); return "show_result"; }//default value is
	 * taken if not given
	 * 
	 
	 @GetMapping("/data") 
	  public String process(@RequestParam (name="sno", required=false) Integer no,
		  @RequestParam("sname") String sname) 
	 { System.out.println(no+" "+sname); return
		  "show_result"; }//default value is taken if not given
*/
	/*
	 * @GetMapping("/data") public String process(@RequestParam (name="sno",
	 * required=false) Integer no, @RequestParam("sname") String
	 * name,@RequestParam("sadd") String addrs[],@RequestParam("sadd") List<String>
	 * saddList,@RequestParam("sadd") Set<String> saddSet) {
	 * System.out.println(no+" "+name+" "+Arrays.toString(addrs)+" "+saddList+" "
	 * +saddSet); return "show_result"; }//default value is taken if not gi1ven
	 */
	/*
	 * @GetMapping("/data") public String process(@RequestParam (name="sno",
	 * required=false) Integer no, @RequestParam("sname") String
	 * name, @RequestParam("sadd") String addrs) {
	 * System.out.println(no+" "+name+" "+addrs); return "show_result"; }//if
	 * multiple values are given through req param values of string type handler
	 * method then the values are appended by comma sepertor 
	 */
	/*
	 * @GetMapping("/data") public String process(@RequestParam Integer
	 * sno,@RequestParam String sname, @RequestParam("sadd") String addrs) {
	 * System.out.println(sno+" "+sname+" "+addrs); return "show_result"; }//can
	 * give unwanted param values also no prroblem but mandatory attributes should
	 * be given
	 * 
	 */
	@Autowired
	private ServletContext sc;
	@Autowired
	private ServletConfig cg;
	@GetMapping("/data") 
	  public String showData(HttpSession ses,HttpServletRequest req,HttpServletResponse res) throws Exception{
		System.out.println("web app name: "+sc.getContextPath());
		System.out.println("DS logical name: "+cg.getServletName());
		System.out.println("Seesion id: "+ses.getId());
		System.out.println("current req uri: "+req.getRequestURI());
		System.out.println("response content type: "+res.getContentType());
		  return "welcome"; }//if multiple values are given through req param values of string type handler method then the values are appended by comma sepertor 

















}
