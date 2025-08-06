package com.pk.finalkeyword;

public class Test06 {
	static int a;
	int x;
	//static final int b;//ce: static final and non static final variable must be initialized
	//final int y;
	static void m2() {
		a=15;
		System.out.println(a);
	}
	void m1() {
		int p;
		final int q;//local final variable need not to inialize
		System.out.println();
	}
	public static void main(String[] args) {
		Test06 test=new Test06();
		test.m1();
		m2();
	}
}
