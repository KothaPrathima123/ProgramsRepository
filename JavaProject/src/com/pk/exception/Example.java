package com.pk.exception;

public class Example {
	void m1(int x) throws IllegalArgumentException,IllegalStateException{
		if(x<0) {
			throw new IllegalArgumentException("Do not pass negative or zero value");
		}
		if(x%2!=0) {
			throw new IllegalStateException("Do not pass odd number");
		}
		System.out.println("Business logic goes here");
	}
}
