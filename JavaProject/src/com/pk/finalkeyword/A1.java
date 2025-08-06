package com.pk.finalkeyword;

public class A1 {
	final int x=10;
	//final int y;//ce: y might not been initialized
	public static void main(String[] args) {
		//a1.y=10;//ce: NSFV is initialized inside a Static Method 
		A1 a1=new A1();
		System.out.println(a1.x);
	}
}
