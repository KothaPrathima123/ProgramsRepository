package com.pk.nsb;

class Test27_SB_TC7{
	static int a;
	static {
		System.out.println("SB");
		      a = 50;
	}
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("  a: "+a);
	}
}