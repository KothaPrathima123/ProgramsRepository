package com.pk.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CheckVoting implements InitializingBean,DisposableBean{
	private String name,addrs;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String checkVotingEligibility() {
		if(age>=18) {
			return name+" u r eligible to vote";
		}
		else {
			return name+" u r not eligible to vote";
		}
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("CheckVoting.destroy()");
		name=null;
		age=0;
		addrs=null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("CheckVoting.afterPropertiesSet()");	
		System.out.println("CheckVoting.check()");
		if(name==null||age<=0)
			throw new IllegalArgumentException("name,age must set with values");
	}

}
