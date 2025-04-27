package com.pk.aspect;

import java.util.Arrays;
import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogAroundAdvice implements MethodInterceptor{
	private Logger logger=Logger.getLogger(LogAroundAdvice.class);
	public LogAroundAdvice() {
		PropertyConfigurator.configure("src/main/java/com/pk/commons/log.properties");
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retValue=null;
		Object[] args=null;
		System.out.println("Entering into "+invocation.getMethod().getName()+" with args "+Arrays.toString(invocation.getArguments()));
		args=invocation.getArguments();
		if(((Float)args[0])<10000) 
			args[1]=(Float)args[1]-0.5f;
		if(((Float)args[0]<=0||((Float)args[1])<=0||((Float)args[2])<=0))
				throw new IllegalArgumentException("input must be positive");
		retValue=invocation.proceed();
		logger.warn("Exited from "+invocation.getMethod().getName()+" with args "+Arrays.toString(invocation.getArguments())+" at "+new Date());
		System.out.println("Leaving from "+invocation.getMethod().getName()+" with args "+Arrays.toString(invocation.getArguments()));
		System.out.println("return value: "+ retValue);
		if(((Float)retValue)>=5000)
			retValue=((Float)retValue)+((Float)retValue)*0.5f;
		return retValue;
	}

}
