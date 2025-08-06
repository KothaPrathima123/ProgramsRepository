package com.pk.oops;

abstract class Example02 {
	static int a = 10;
	int x = 20;

	void m1(){
		System.out.println("m1 is executed from class Example for the object "+ this);
	}
}

class Sample02 extends Example02{

}

class Test03{
	public static void main(String[] args) {
		Example02 e1 ;
		//e1 = new Example();
		
		e1 = new Sample02();
		e1.m1();
	}
}