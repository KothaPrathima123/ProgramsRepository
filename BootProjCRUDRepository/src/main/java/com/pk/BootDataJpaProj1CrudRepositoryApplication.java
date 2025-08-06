package com.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pk.entity.Doctor;
import com.pk.service.IDoctorService;
@SpringBootApplication
public class BootDataJpaProj1CrudRepositoryApplication {

	public static void main(String[] args) {
	ApplicationContext  ctx=SpringApplication.run(BootDataJpaProj1CrudRepositoryApplication.class, args);
	IDoctorService service=ctx.getBean("doctorService",IDoctorService.class);
	try {
		Doctor doc=new Doctor();
		doc.setDocName("rajesh");
		doc.setSpecialization("cardio");
		doc.setIncome(3000.0);
		String resMsg=service.registerDoctor(doc);
		System.out.println(resMsg);
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	}

}
