package com.pk.aspect;

import java.util.Arrays;
import java.util.HashMap;

import org.aspectj.lang.ProceedingJoinPoint;


public class CacheAdvice {
HashMap<String,Object> cache=new HashMap<String, Object>();
public Object caching(ProceedingJoinPoint pjp) throws Throwable{
	String key=pjp.getSignature()+Arrays.toString(pjp.getArgs());
	if(cache.containsKey(key)) {
		Object retVal=pjp.proceed();
		cache.put(key, retVal);
		System.out.println("From Target Method");
		return retVal;
	}
	else {
		System.out.println("From cache");
		return cache.get(key);
	}
}


}
