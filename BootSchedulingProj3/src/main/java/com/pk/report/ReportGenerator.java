package com.pk.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("report")
public class ReportGenerator {//executes this method with initial delay 2sec and fixed 3 sec
	
	@Scheduled(fixedDelay=3000)
	public void generateReport() {//the method where @Scheduled is placed must be no param method becoz IOC container cannot pass those args
		//while calling method automatically IOC takes obj for this spring bean and calls this @scheduled meth repeatedly for multiple times having initialDelay and fixeddelayas specified until we stp the app
		System.out.println("Sales Report:: "+new Date()+"(start)");
	try {
		Thread.sleep(15000);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("end of salesReport "+new Date());
	
	
	}
}
