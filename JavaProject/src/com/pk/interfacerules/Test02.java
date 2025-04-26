package com.pk.interfacerules;

abstract class Example2 {
	abstract void m1();
	abstract void m2();
}
abstract class Sample2 extends Example2{
	void m1() {
		System.out.println("Sample2.m1()");
	}	
}
class Xyz extends Sample2{
	void m2() {
		System.out.println("Xyz.m2()");
	}
}
class Pqr extends Sample2{
	void m2() {
		System.out.println("Pqr.m2()");
	}
}
public class Test02{
	public static void main(String[] args) {
		Example2 e1;
		//e1=new Example2();
		//e1=new Sample2();
		e1=new Xyz();
		e1.m1();
		e1.m2();
		e1=new Pqr();
		e1.m1();
		e1.m2();
	}
}