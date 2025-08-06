package com.pk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pk.beans.MyServletContainer;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/pk/cfgs/applicationContext.xml");
		MyServletContainer container=ctx.getBean("container",MyServletContainer.class);
		container.processRequest("hi");
		container.processRequest("hello!");

	}

}
