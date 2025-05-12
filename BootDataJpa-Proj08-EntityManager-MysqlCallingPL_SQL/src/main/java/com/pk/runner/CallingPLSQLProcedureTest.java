package com.pk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pk.sevice.IEmployeeMgntService;

@Component
public class CallingPLSQLProcedureTest implements CommandLineRunner{
	@Autowired
	private IEmployeeMgntService service;
	
	@Override
	public void run(String... args) throws Exception {
		service.showEmployeeBySalaryRange(1000.0,2999.0).forEach(System.out::println);
	}
	
}