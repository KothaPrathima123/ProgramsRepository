package com.pk.interfacerules;

class Example3 {
	static int a =10;
	int x=20;
	void m1() {
		System.out.println("m1 is executed from class Example3 for the object "+this);
	}
}
class Sample3 extends Example3{
	
}
public class Test04{
	public static void main(String[] args) {
		Example3 e1;
		e1=new Example3();
		e1=new Sample3();
		e1.m1();
	}
	
}