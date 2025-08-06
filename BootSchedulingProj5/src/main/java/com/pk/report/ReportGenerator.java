package com.pk.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("report")
public class ReportGenerator {//executes this method with initial delay 2sec and fixed 3 sec
	
	/*
	 * //@Scheduled(cron="15 * * * * *")//executes for every minute 15th sec
	 * //@Scheduled(cron="15 20 16 * * *")//executes task at 4pm 20 min 15th sec
	 * every month/day //@Scheduled(cron="0 0 16 1 * *")//executes every month 1st
	 * at 4pm //@Scheduled(cron="0 * * * * *")//executes every minute 0th sec
	 * //@Scheduled(cron="0 27,28 * * * *") executes the task every hour 27th,28th
	 * minutes 0 sec //@Scheduled(cron="0 0 10 29 2 *")//executes only leap year feb
	 * 29th 10am leap year of feb contains 29 days
	 * //@Scheduled(cron="1 2 5 6 * *")//executes the task evey month 6th date
	 * 5:02:01am //@Scheduled(cron="0 0 10 ? 7 ?")executes the task on any weekday
	 * of july month at 10 am
	 cron expressions of point of time*/
	//@Scheduled(cron="10 0/15 * * * *")//executes having 15 mins gap at 10sec
	//@Scheduled(cron="10 20/1 16 * * *")//executes at 20th min and each min 10second
	//@Scheduled(cron="0 0/20 * * * *")to execute every hour having 20 min gap
	//@Scheduled(cron="* * * * * MON")execute evry min sec on monday
	//@Scheduled(cron="0 0 11 ? 1/3 *")executes acc stmt for every 3 onths at 11AM
	//? can be used only in day,weekday column representing to exec task any day irrespective of special days like 1st or 31st 30th,leap year feb 29th  and etc
	//@Scheduled(cron="0 0 10 * * SUN") or(cron="0 0 10 * * 0) or (cron="0 0 10 * * 7)
	
	public void generateReport() {//the method where @Scheduled is placed must be no param method becoz IOC container cannot pass those args
		//while calling method automatically IOC takes obj for this spring bean and calls this @scheduled meth repeatedly for multiple times having initialDelay and fixeddelayas specified until we stp the app
		System.out.println("Sales Report:: "+new Date());	
	}
}
