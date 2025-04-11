package com.pk.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class CommonExceptionLogger {
	public void exceptionLogging(JoinPoint jp,ArithmeticException ae) {
		System.out.println(ae.getClass()+" Exception raised with msg "+ae.getMessage()+" in "+jp.getSignature()+" with args "+Arrays.toString(jp.getArgs()));
		throw new IllegalArgumentException("Provide valid inputs");
	}
}
