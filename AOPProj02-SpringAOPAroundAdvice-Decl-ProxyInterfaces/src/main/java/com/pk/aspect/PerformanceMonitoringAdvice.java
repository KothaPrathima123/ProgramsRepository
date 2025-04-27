package com.pk.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoringAdvice implements MethodInterceptor {
	
	private long start,end;
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retValue=null;
		start=System.currentTimeMillis();//pre logic
		retValue=invocation.proceed();//calling target method
		end=System.currentTimeMillis();//post logic
		System.out.println(invocation.getMethod().getName()+" has taken "+(end-start)+" ms to complete execution");
		return retValue;
	}

}
