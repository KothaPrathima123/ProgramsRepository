package com.pk.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pk.service.IWishMessageService;

@Controller
public class WishMessageOperatiosController {
	@Autowired
	private IWishMessageService service;

	@RequestMapping("/home")
	public String showHomePage() {
		return "welcome";
	}


	@RequestMapping("/wish")
	public String fetchWishMessage(Model model) {
		System.out.println("shared memory obj class name"+model.getClass());
		String msg=service.generateWishMessage("ram");
		model.addAttribute("wMsg",msg);
		System.out.println(msg);
		model.addAttribute("sysDate",new Date());
		System.out.println(new Date());
		return "show_result";
		
	}
	
}
