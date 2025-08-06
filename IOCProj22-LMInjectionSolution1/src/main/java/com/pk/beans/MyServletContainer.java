package com.pk.beans;

import javax.servlet.RequestDispatcher;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyServletContainer implements ApplicationContextAware{
	ApplicationContext ctx;
	private String beanId;
	
	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param constructor");
	}
	public void setBeanId(String beanId) {
		this.beanId=beanId;
	}
	public void processRequest(String data) {
		RequestHandler handler=ctx.getBean("rh",RequestHandler.class);
		handler.handle(data);
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ctx=applicationContext;
	}
}
