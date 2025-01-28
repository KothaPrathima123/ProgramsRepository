package com.pk.tasks;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component("scheduletask")
public class ScheduledTasks {
@Scheduled(cron="1/15 * * * * *")
public void generateSalesReport() {//the method where @Scheduled is placed must be no param method becoz IOC container cannot pass those args
	//while calling method automatically IOC takes obj for this spring bean and calls this @scheduled meth repeatedly for multiple times having initialDelay and fixeddelayas specified until we stp the app
	System.out.println("SalesReport:: "+new Date());
}
}
