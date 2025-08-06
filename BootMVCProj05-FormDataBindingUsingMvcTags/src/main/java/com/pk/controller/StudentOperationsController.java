package com.pk.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pk.model.Student;

@Controller
public class StudentOperationsController {
	@GetMapping("/register")
	public String showForm(@ModelAttribute("stud") Student st) {
		System.out.println("StudentOperationsController.showform()");
		System.out.println("Model class Object data::"+st);
		return "student_register";
	}
	
	
	@PostMapping("/register")
	public String processStudent(Map<String,Object> map,@ModelAttribute("stud") Student st) {
		System.out.println("StudentOperationsController.processStudent()");
		System.out.println("model class object data::"+st);
	String grade=null;
		if(st.getAvg()>=75)
			grade="First class with Dist";
		else if(st.getAvg()>=60)
			grade="First Class";
		else if(st.getAvg()>=50)
			grade="Second Class";
		else if(st.getAvg()>=35)
			grade="Third class";
		else
			grade="fail";
		map.put("result",grade);
		return "show_result";
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
