package com.pk.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("report")
public class ReportGenerator {//executes this method with initial delay 2sec and fixed 3 sec
	
	@Scheduled(initialDelay=2000,fixedDelay=5000)
	public void generateSalesReport() {
		System.out.println("thread(task1) name:: "+Thread.currentThread().getName());
		System.out.println("Thread(task1) hashCode:: "+Thread.currentThread().hashCode());
		System.out.println("reort generated on:: "+new Date());
	}
	
	@Scheduled(fixedDelay=3000,initialDelay=2000)
	public void generateSalesReport1() {
		System.out.println("thread(task2) name:: "+Thread.currentThread().getName());
		System.out.println("Thread(task2) hashCode:: "+Thread.currentThread().hashCode());
		System.out.println("reort data1 generated on:: "+new Date());
	}
}
