package com.pk.interfacerules;

import com.pk.collections.Employee01;

abstract class Example1 {
	abstract void m1();
	abstract void m2(String s);
	abstract void m3() throws Exception;
	public abstract Employee01 m4(String name);
	//private abstract static void m5();
	//protected abstract static void m6();//ce:The abstract method m6 in type Example1 can only set a visibility modifier, one of public or protected
	//abstract native void m7();
	//abstract synchronized void m8();
	//abstract strictfp void m9();
	//private abstract void m10();
	//static abstract void m11();
	//final abstract void m12();
	public abstract void m13() throws ClassNotFoundException;
	protected abstract void m14();
	public Example1() {
		System.out.println("Example1.Example1()");
	}
	
}
public class Sample01 extends Example1{

	@Override
	void m1() {	}

	@Override
	void m2(String s) {
		System.out.println("Sample.m2()");
	}

	@Override
	void m3() throws Exception {
		System.out.println("Sample.m3()");
	}

	@Override
	public Employee01 m4(String name) {
		
		return new Employee01(1, "abc", "clerk", 3450);
	}

	@Override
	public void m13() throws ClassNotFoundException {
		System.out.println("Sample01.m13()");
	}

	@Override
	protected void m14() {
		System.out.println("Sample01.m14()");
	}
	void m15() {
		System.out.println("Sample01.m15()");
	}
class Test01{
	public static void main(String[] args) {
		//Example1 e1=new Example1();
		Example1 e2=new Sample01();
		e2.m1();
	}
	}	
}
