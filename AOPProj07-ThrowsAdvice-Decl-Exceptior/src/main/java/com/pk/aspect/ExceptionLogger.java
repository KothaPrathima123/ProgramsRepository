package com.pk.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLogger implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException ie) {
		throw new NumberFormatException("Exception Changed");
	}
	public void afterThrowing(Method method,Object args[],Object target,Throwable ie) {
		System.out.println(ie.getClass()+" Exception is raised in "+method.getName()+" with args "+Arrays.toString(args)+" in "+target.getClass());
	}

}
