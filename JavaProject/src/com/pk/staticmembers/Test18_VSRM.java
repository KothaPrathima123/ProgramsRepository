package com.pk.staticmembers;


class Test18_VSRM{
	static int a = 10;
	static int b=10;
	static int c=20;
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(Test18_VSRM.a);
		System.out.println();

		int  a = 50;
		System.out.println(a);
		System.out.println(Test18_VSRM.a);
		System.out.println();

		a = 60;
		System.out.println(a);
		System.out.println(Test18_VSRM.a);
		System.out.println();

		Test18_VSRM.a = 70;
		System.out.println(a);
		System.out.println(Test18_VSRM.a);
		System.out.println();

		int b = 90;
		System.out.println(b);
		System.out.println(Test18_VSRM.b);

		int c = 100;
		System.out.println(c);
		System.out.println(Test18_VSRM.c);

	}
}
