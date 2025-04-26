package com.pk.staticmembers;

class Test11_SVMMEF_TC2{
	static int   a   = m1();
	static int m1(){
		System.out.println("SV a is created and initailized");
		return 10;
	}

	static int m2(){
		System.out.println("SV b is created and initailized");
		return 20;
	}
	public static void main(String[] args) {
		System.out.println("In main");
		System.out.println("  a: "+a);//10
		System.out.println("  b: "+b);//20
	}
	static int   b   = m2();
}

