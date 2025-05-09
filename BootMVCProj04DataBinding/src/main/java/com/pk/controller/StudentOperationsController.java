package com.pk.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pk.model.Student;

@Controller
public class StudentOperationsController {
	@GetMapping("/")
	public String showHomePage() {
		return "welcome";
	}
	@GetMapping("/register")
	public String showStudentFormPage() {
		return "student_register";
		
	}
	@PostMapping("/register")
	public String registerStudent(Map<String,Object> map,@ModelAttribute("stud") Student st) {
		System.out.println(st);
		return "show_result";
	}
}
