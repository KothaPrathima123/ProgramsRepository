package com.pk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pk.aspect.AuthenticationManager;
import com.pk.service.IntrAmtCalculator;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/pk/cfgs/applicationContext.xml");
		AuthenticationManager authManager=ctx.getBean("authManager",AuthenticationManager.class);
		authManager.signIn("ramesh", "vizag");
		IntrAmtCalculator proxy=ctx.getBean("pfb",IntrAmtCalculator.class);
		float amt=proxy.calcIntrAmt(30000, 10, 3);
		System.out.println("Intr amt: "+amt);
		authManager.signOut();
	}

}
