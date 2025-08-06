package com.pk.finalkeyword;

public class A {
	static int a;
	//static final int b; //var b might not have been initilazed and sfv can be initialized either in static block or declaration statement
	public static void main(String[] args) {
		a=10;
		//b=20;//The final field A.b cannot be assigned
	}
}
