package com.pk.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.pk.model.Employee;

//@RequestMapping("/wish-operations")
@Controller
public class SeasonOperationsController {
	/*
	 * request path is case sensitive in handler methods of one or more controller
	 * classes
	 * 
	 * @RequestMapping("/report") public String showReport() throws Exception{
	 * return "show_report"; }
	 * 
	 * @RequestMapping("/REPORT") public String showReport1() throws Exception{
	 * return "show_report1"; }
	 */
	/*
	 * one handler method can be mapped with multple requests
	 * 
	 * @RequestMapping({"/report1","/report2","/report3"}) public String
	 * showReport() throws Exception{ return "show_report"; }
	 */
	/*
	 * @RequestMapping("/") public String showHomePage() { return "welcome"; }
	 */
	/*
	 * two handler methods of controller class can have same req path having two
	 * different req modes like GET,POST
	 */
	/*
	 * @RequestMapping(value="/report", method=RequestMethod.GET)
	 * 
	 * @GetMapping("/report") public String showReport() throws Exception {
	 * System.out.println("WishMessageOperationsController.showReport()"); return
	 * "show_report"; }
	 * 
	 * @RequestMapping(value="/report", method=RequestMethod.POST)
	 * 
	 * @GetMapping("/report") public String showReport1() throws Exception {
	 * System.out.println("WishMessageOperationsController.showReport1()"); return
	 * "show_report1"; }
	 */
	/*
	 * @GetMapping("/all") public String showAllData() { return "show_report"; }
	 * IllegalStateException Ambigous mapping along with method level req paths
	 * providec lass level global path using @RequestMapping annotation as below
	 */
	/*
	 * @GetMapping("/all") public String showAllData() {
	 * System.out.println("SeasonOperationsController.showAllData()"); return
	 * "show_report"; }
	 */
	/*
	 * @GetMapping("/report") public String showHomePage() {
	 * System.out.println("SeasonOperationsController.showHomePage()"); return
	 * "forward:test-operations/all"; }
	 */
	/*
	 * @GetMapping("/report") public String sendData(Map<String,Object> map) {
	 * map.put("name", "raja"); map.put("age", 30); map.put("favColors",new String[]
	 * {"red","green","yellow"}); map.put("nickNames",
	 * List.of("raja","raj","green","yellow")); map.put("phoneNumbers",
	 * Set.of(999999L,67788L,988777L)); map.put("idDetails",Map.of("aadharNum",
	 * 78900,"voterId", 2456839)); return "show_report"; }
	 */
	@GetMapping("/report")
	public String sendData(Map<String,Object> map) {
	Employee emp=new Employee();
	emp.setEno(1001);
	emp.setEname("raja");
	emp.setSalary(90000.0);
	emp.setVaccinated(true);
		map.put("empInfo",emp);
		//return LVN
		List<Employee> empsList=List.of(new Employee(1001,"raja",9000.0,true),new Employee(1002,"rajesh",8000.0,true),new Employee(1003,"mahesh",9000.0,true));
		map.put("empsListInfo", empsList);
		
		return "show_data";
	}












}
