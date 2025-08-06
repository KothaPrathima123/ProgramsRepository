package com.pk.service;

public class DivMath {
	public float div(int x,int y) {
		if(y==0)
		     throw new ArithmeticException("Diviser can not zero");
		else
			return (float)x/y;
	}
}
