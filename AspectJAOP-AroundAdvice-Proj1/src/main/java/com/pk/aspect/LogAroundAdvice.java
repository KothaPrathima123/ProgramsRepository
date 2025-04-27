package com.pk.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAroundAdvice {
	public Object logging(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Entering into "+pjp.getSignature()+" With args "+Arrays.toString(pjp.getArgs()));
		Object args[]=pjp.getArgs();
		if((Float)args[0] <=50000) {
			args[2]=(Float)args[2]-1;
		}
		Object retVal=null;
		if((Float)args[0]==0||(Float)args[1]==0||(Float)args[2]==0)
			throw new IllegalArgumentException("Provide +ve values as the p,t,r values");
		else
			retVal=pjp.proceed(args);
		retVal=(Float)retVal+(Float)retVal*0.05f;
		System.out.println("Exiting from "+pjp.getSignature()+" with args "+Arrays.toString(pjp.getArgs()));
		return retVal;
	}
}
