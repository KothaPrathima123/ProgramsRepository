package com.pk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pk.beans.Robot;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/pk/cfgs/applicationContext.xml");
		Robot robo=ctx.getBean("robot",Robot.class);
		System.out.println(robo);

	}

}
