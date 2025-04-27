package com.pk.controller;


import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pk.entity.Employee;
import com.pk.service.IEmployeeMgmtService;
import com.pk.validations.EmployeeValidator;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeOperationsController {
	@Autowired
	private   IEmployeeMgmtService empService;
	@Autowired
	private EmployeeValidator empValidator;
	
	@GetMapping("/")
	public  String  showHomePage() {
		//reurn home page LVN
		return "welcome";
	}
	
	/*	@GetMapping("/report")
		public   String   showEmployeeReportData(Map<String,Object> map) {
			System.out.println("EmployeeOperationsController.showEmployeeReportData()");
			//use  Service
			Iterable<Employee>  empsList=empService.showAllEmloyees();
			// keep the results in shared Memory
			map.put("empsData", empsList);
			//return LVN
			return  "show_report";
		}*/
	
	@GetMapping("/add")
	public String showEmployeeReport(@ModelAttribute("emp") Employee emp ) {
		System.out.println("EmployeeOperationsController.showEmployeeReport()");
		emp.setJob("CLERK");
		return "employee_register_form";
	}
	@GetMapping("/register")  //soultion3 
	public  String    showregisterEmployee(@ModelAttribute("emp")  Employee emp) {
		System.out.println("EmployeeOperationsController.registerEmployee()");
		//use service
		emp.setJob("salesman");
		//keep the result in  shared memory as the model attribute
		
		return  "employee_register_form";
	}
	
	
	
	/*@PostMapping("/add")  //problem
	public  String    registerEmployee(Map<String,Object> map,
			                                                       @ModelAttribute("emp")  Employee emp) {
		//use service
		String msg=empService.registerEmployee(emp);
		Iterable<Employee> empsList=empService.showAllEmloyees();
		//keep the result in  shared memory as the model attribute
		map.put("resultMsg", msg);
		map.put("empsData", empsList);
		//return LVN
		return  "show_report";
	}*/
	
	/*@PostMapping("/register")  //soultion1  with limitation
	public  String    registerEmployee(Map<String,Object> map,
			                                                       @ModelAttribute("emp")  Employee emp) {
		System.out.println("EmployeeOperationsController.registerEmployee()");
		//use service
		String msg=empService.registerEmployee(emp);
		//keep the result in  shared memory as the model attribute
		map.put("resultMsg", msg);
		//return LVN
		return  "redirect:report";
	}*/
	
		/*@PostMapping("/register")  //soultion2 (best)
		public  String    registerEmployee(RedirectAttributes attrs,
				                                                       @ModelAttribute("emp")  Employee emp) {
			System.out.println("EmployeeOperationsController.registerEmployee()");
			//use service
			String msg=empService.registerEmployee(emp);
			//keep the result in  shared memory as the model attribute
			attrs.addFlashAttribute("resultMsg", msg);
			//return LVN
			return  "redirect:report";
		}*/
		
		@PostMapping("/register")  //soultion3 
		public  String    registerEmployee(HttpSession ses,@ModelAttribute("emp")  Employee emp,BindingResult errors) {
			System.out.println("EmployeeOperationsController.registerEmployee()");
			if(emp.getVflag().equalsIgnoreCase("no")) {
			if(errors.hasFieldErrors())
				return "employee_register_form";
			
			if(empValidator.supports(emp.getClass())) {
				empValidator.validate(emp, errors);
				if(errors.hasErrors())
					return "employee_register_form";
			}
			}
			if(emp.getJob().equalsIgnoreCase("hacker")) {
				errors.rejectValue("job","job.reject");
				return "employee_register_form";
			}
			//use service
			String msg=empService.registerEmployee(emp);
			//keep the result in  shared memory as the model attribute
			ses.setAttribute("resultMsg", msg);
			//return LVN
			return  "redirect:report";
		}
	
	@GetMapping("/edit")
	public   String  showEditFormPage(@RequestParam("no") int no,
			                                                        @ModelAttribute("emp") Employee emp) {
		//use service
		Employee emp1=empService.fetchEmployeeByNo(no);
		//copy  the data to Model class obj
		BeanUtils.copyProperties(emp1, emp);
		//return LVN of edit form page
		return  "employee_edit_form";
	}
	
	@PostMapping("/edit")
	public  String  updateEmployee(@ModelAttribute("emp")  Employee emp,
			                                                    RedirectAttributes  attrs,BindingResult errors) {
		if(emp.getVflag().equalsIgnoreCase("no")) {
		if(errors.hasFieldErrors())
			return "employee_edit_form";
		if(empValidator.supports(emp.getClass())) {
			empValidator.validate(emp, errors);
			if(errors.hasErrors())
				return "employee_edit_form";
			
		}
		}
		if(emp.getJob().equalsIgnoreCase("hacker")) {
			errors.rejectValue("job","job.reject");
			return "employee_edit_form";
		}
		//use service
		String msg=empService.updateEmployee(emp);
		//keep the result in flash attributes
		attrs.addFlashAttribute("resultMsg", msg);
		//return LVN
		return "redirect:report";
	}
	
	@GetMapping("/delete")
	public   String   deleteEmployeeById(@RequestParam("no") int no,
			                                                            RedirectAttributes attrs) {
		//use service
		String msg=empService.deleteEmployeeById(no);
		// keep the  result in flash attributes
		attrs.addFlashAttribute("resultMsg", msg);
		//perform redirection
		return "redirect:report";
	}
	@GetMapping("/report")
	public String showEmployeeReport(@PageableDefault(page=0,size=3,sort="job",direction = Sort.Direction.ASC) Pageable pageable,
			Map<String,Object> map) {
		System.out.println("EmployeeOperationsController.showEmployeeReport()");
		Page<Employee> page=empService.getEmployeePageData(pageable);
		map.put("empsData", page);
		return "employee_report";
	}
	
	
	
}
