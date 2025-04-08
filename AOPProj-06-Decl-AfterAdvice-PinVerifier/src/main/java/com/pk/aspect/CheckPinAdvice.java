package com.pk.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;

public class CheckPinAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Generated pin: "+returnValue);
		System.out.println("target class: "+target.getClass());
		System.out.println("target method: "+method.getName());
		System.out.println("target method args: "+Arrays.toString(args));
		int cardNo=(Integer)args[0]+100;
		int pin=(Integer)returnValue;
		if(pin<=999)
			throw new IllegalArgumentException("Week Pin Generated");
	}
	
}
