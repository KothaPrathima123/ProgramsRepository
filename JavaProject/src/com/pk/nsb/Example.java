package com.pk.nsb;

class Example{
	static int a;
	static {
		System.out.println("SB");
		int a = 50;
		      a = 60;		      
		Example.a = 70;
	}
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("a: "+a);
	}
}