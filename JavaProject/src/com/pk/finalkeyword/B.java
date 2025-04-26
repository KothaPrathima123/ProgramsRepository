package com.pk.finalkeyword;

public class B {
	static final int a=10;
	static final int b;
	static final int c;
	static {
		//a=15;ce: acnnot assign a val to FV a
		b=16;
	}
	static {
		//b=17;ce: avr b might already have been assigned
		c=23;
	}
	static void m1() {
		//c=18; ce: cannot assign a value to FV c
	}
	public static void main(String[] args) {
		System.out.println(a+" "+b+" "+c);
		System.out.println(B.a+" "+B.b+" "+B.c);
		B b1=new B();
		System.out.println(b1.a+" "+b1.b+" "+b1.c);// we can access static variable with onj but not recommanded
		
	}
	
}
