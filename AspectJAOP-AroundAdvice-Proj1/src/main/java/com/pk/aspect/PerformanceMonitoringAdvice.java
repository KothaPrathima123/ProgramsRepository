package com.pk.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoringAdvice {
	private long start,end;
	public Object pMonitor(ProceedingJoinPoint pjp) throws Throwable{
		start=System.currentTimeMillis();
		Object retVal=pjp.proceed();
		end=System.currentTimeMillis();
		System.out.println(pjp.getSignature()+" With "+Arrays.toString(pjp.getArgs()));
		return retVal;
	}

}
