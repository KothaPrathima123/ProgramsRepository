package com.pk.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pk.model.Employee;
import com.pk.service.IEmployeeMgntService;

import jakarta.servlet.http.HttpSession;
@Controller
@RequestMapping("/employee")
public class EmployeeOperationsController {
	@Autowired
	private IEmployeeMgntService empService;
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	@GetMapping("/emp_report")
	public String showEmployeeReport(Map<String,Object> map) {
		System.out.println("EmployeeOperationsController.showEmployeeReport()");
		Iterable<Employee> itEmps=empService.getAllEmployees();
		map.put("empsList", itEmps);
		//System.out.println("employee is saved with id: "+empRepo.save(emp).getEmpno());
		return "show_employee_report";
	}
	@GetMapping("/emp_add")
	public String showFormForsaveEmployee(@ModelAttribute("emp") Employee emp) {
		return "register_employee";
	}
	/*
	 * @PostMapping("/emp_add") public String saveEmployee(@ModelAttribute("emp")
	 * Employee emp,Map<String,Object> map) { String
	 * msg=empService.registerEmployee(emp); //Iterable<Employee>
	 * itEmps=empService.getAllEmployees(); map.put("resultMsg", msg);
	 * //map.put("empsList",itEmps); return "redirect:emp_report"; }source ahndler postmapping method destination
	 * // method get ma[ping are not using same req,res objs becoz send redircetion the model attributes (eq scope) of source can not be used/asscessed indesc method and its LVN based jsp page 
	 * to solve this use flash attributes by placin in redirectattributes objects(another shared with redirection scope) no changes ingetMApping
	 */
	/*
	 * @PostMapping("/emp_add") public String saveEmployee(@ModelAttribute("emp")
	 * Employee emp,RedirectAttributes attrs) {
	 * System.out.println("EmployeeOperationsController.saveEmployee()"); String
	 * msg=empService.registerEmployee(emp); //Iterable<Employee>
	 * attrs.addAttribute("resuLtMsg",msg);//here if we give next req to dest method
	 * of redirection by using refresh button the eairlier displayed
	 * "falsh attribute" related msg will not come return "redirect:emp_report";
	 * 
	 * }
	 */
	@PostMapping("/emp_add") 
	public String saveEmployee(@ModelAttribute("emp")
	  Employee emp,HttpSession ses) {
		 System.out.println("EmployeeOperationsController.saveEmployee()");
		 String msg=empService.registerEmployee(emp); //Iterable<Employee>
	  ses.setAttribute("resuLtMsg",msg);//here if we give next req to dest method of redirection by using refresh button the eairlier displayed "falsh attribute" related msg will not come
	  return "redirect:emp_report";
	
	 }
	@GetMapping("/emp_edit")
	public String showEditEmployeeFormPage(@RequestParam("no") int no,@ModelAttribute("emp") Employee emp) {
		Employee emp1=empService.getEmployeeByNo(no);
		BeanUtils.copyProperties(emp1, emp);
		//return LVN
		return "update_employee";
	}
	@PostMapping("/emp_edit")
	public String editEmployee(RedirectAttributes attrs,@ModelAttribute("emp") Employee emp) {
		String msg=empService.updateEmployee(emp);
		attrs.addFlashAttribute("resultMsg",msg);
		return "redirect:emp_report";
	}
	
	@GetMapping("/emp_delete")
	public String deleteEmployee(RedirectAttributes attrs,@RequestParam int no) {
		String msg=empService.deleteEmployeeById(no);
		attrs.addFlashAttribute("resultMsg",msg);
		return "redirect:emp_report";
	}
	
	
	
}
