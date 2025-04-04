package com.pk.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Vehicle implements ApplicationContextAware{
	
	private String beanId;
	private Engine enggId;
	private ApplicationContext ctx;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Vehicle.setApplicationContext():0-param, constructor");
		this.ctx=ctx;
	}
	public Vehicle() {
		System.out.println("Vehicle.Vehicle():0-param constr");
	}
	public void setEnggId(Engine enggId) {
		System.out.println("Vehicle.setEnggId()");
		this.enggId=enggId;
	}
	public void move() {
		Engine engine=ctx.getBean("enggId",Engine.class);
		engine.start();
		System.out.println("vehicle moved for journey");
	}
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
}
