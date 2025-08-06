package com.pk.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor{
	Map<String,Object> cache=new HashMap();
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String key=null;
		Object retValue=null;
		System.out.println(invocation.getClass());
		key=invocation.getMethod().getName()+Arrays.toString(invocation.getArguments());
		if(!cache.containsKey(key)) {
			System.out.println("From Target Method");
			retValue=invocation.proceed();
			cache.put(key, retValue);
		} else {
		System.out.println("From Cache");
		retValue=cache.get(key);
	}
	return retValue;
	}
}
