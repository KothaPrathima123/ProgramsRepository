package com.pk.test;



import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pk.beans.ScheduleReminder;

public class ClientApp {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/pk/cfgs/applicationContext.xml");
		ScheduleReminder reminder=ctx.getBean("reminder",ScheduleReminder.class);
		System.out.println(reminder);
		
	}
}
