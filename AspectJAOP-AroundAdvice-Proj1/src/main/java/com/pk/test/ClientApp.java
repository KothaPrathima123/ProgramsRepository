package com.pk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pk.service.IntrAmtCalculator;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/pk/cfgs/applicationContext.xml");
		IntrAmtCalculator proxy=ctx.getBean("target",IntrAmtCalculator.class);
		System.out.println(proxy.getClass());
		System.out.println("Simple interest amt: "+proxy.calsimpleIntrAmt(1000, 10, 2));
		System.out.println("---------------------------------------");
		System.out.println("Compound Intr Amt: "+proxy.calCompoundIntrAmt(23340, 10, 3));
		System.out.println("-----------------------------------------");
		System.out.println("Compound Intr Amt: "+proxy.calCompoundIntrAmt(182990, 10, 3));
		
	}

}
