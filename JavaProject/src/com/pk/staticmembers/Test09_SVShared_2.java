package com.pk.staticmembers;
class Test09_SVShared_2{
	static int a = 10;

	static void m1(){
		a = 50;
		System.out.println("From m1   a: "+a);
	}

	public static void main(String[] args) {
		System.out.println("From main a: "+a);
		m1();
		System.out.println("From main a: "+a);
	}
}