package com.pk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pk.service.DoctorManagementServiceImpl;
@Component
public class QueryMethodsTestRunner implements CommandLineRunner{
@Autowired
private DoctorManagementServiceImpl service;
	
//IDoctorService service=ctx.getBean("doctorService",IDoctorService.class);
	/*try {
		Doctor doc=new Doctor();
		doc.setDocName("raja");
		doc.setSpecialization("md");
		doc.setIncome(3000.0);
		String resMsg=service.registerDoctor(doc);
		System.out.println(resMsg);
	}
	catch(Exception e) {
		e.printStackTrace();
	}*/
   @Override
	public void run(String... args) throws Exception {
		service.showDoctorByIncomeRange(20000.0,300000.0).forEach(System.out::println);
	}
   

}
