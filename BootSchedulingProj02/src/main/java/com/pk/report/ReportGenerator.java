package com.pk.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("report")
public class ReportGenerator {//executes this method with initial delay 2sec and fixed 3 sec
	//@Scheduled(initialDelay=2000,fixedDelay=3000)
	@Scheduled(fixedDelay=3000)//executes this method with no initial delay and fixed delay 2sec
	//@Scheduled(fixedDelay=3000)//java.lang.IllegalStateExcepton Could not create recurring task for @Scheduled method 'generateSalesReport': Only no-arg methods may be annotated with @Scheduled
	//public void generateSalesReport(int s,int e) {}
	@Scheduled(fixedDelayString="3000")//can also use string 
	//@Scheduled()//we cannot place we must place cron or fixedRate orfixedDelay params int this annotation otherwise exception will be raised beanCreationExceptionBoot 
	public void generateSalesReport() {//the method where @Scheduled is placed must be no param method becoz IOC container cannot pass those args
		//while calling method automatically IOC takes obj for this spring bean and calls this @scheduled meth repeatedly for multiple times having initialDelay and fixeddelayas specified until we stp the app
		System.out.println("SalesReport:: "+new Date());
	}
}
