package com.pk.encrypt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/customer")
public class PasswordEncoder {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String pwd1=encoder.encode("rani");
		String pwd2=encoder.encode("hyd");
		System.out.println(pwd1);
		System.out.println(pwd2);
	}
}
