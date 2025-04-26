package com.pk.basics;

class  Addition{
	static int add(int a, int b) 
						throws IllegalArgumentException {

		if(a<0 || b<0){
			throw  new  IllegalArgumentException(
											"Do not pass -ve numbers");
		}
		
		return  a + b;
		
	}
}