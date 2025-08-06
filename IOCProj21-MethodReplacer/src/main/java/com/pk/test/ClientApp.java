package com.pk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pk.beans.Bank;
import com.pk.beans.IntrRateReplacer;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/pk/cfgs/applicationContext.xml");
		Bank bank=ctx.getBean("bank",Bank.class);
		IntrRateReplacer mr=ctx.getBean("mr",IntrRateReplacer.class);
		System.out.println(bank+" "+mr);
		System.out.println("Intr Amt"+bank.calIntrAmt(10000, 10));
	}
}
