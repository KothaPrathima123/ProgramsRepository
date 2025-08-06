package com.pk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pk.beans.IIntrAmtCalculator;
import com.pk.beans.IntrAmtCalculator;




public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/pk/cfgs/applicationContext.xml");
		IIntrAmtCalculator proxy=ctx.getBean("pfb", IIntrAmtCalculator.class);
		float intrAmt=proxy.calIntrAmt(34566, 2, 12);
		System.out.println("Intr amt: "+intrAmt);
		System.out.println("------------");
		float intrAmt1=proxy.calIntrAmt(54555, 3, 10);
		System.out.println("Intr1 amt: "+intrAmt1);
		System.out.println("-------------");
		float intrAmt2=proxy.calIntrAmt(3455, 4, 1);
		System.out.println("Intr2 amt: "+intrAmt2);
		System.out.println("---------------");
		
	}

}
