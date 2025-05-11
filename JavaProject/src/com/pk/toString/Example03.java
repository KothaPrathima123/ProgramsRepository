package com.pk.toString;

class Example03 {

	static int a = 10;
	static int b = 20;

	int x = 30;
	int y = 40;

	public static void main(String[] args) {

		Example03 e1 = new Example03();
		Example03 e2 = new Example03();
		Example03 e3 = null;
		Example03 e4;

		System.out.println(a);
		System.out.println(Example03.a);
		System.out.println(e1.a);
		System.out.println(e3.a);
		System.out.println();

		//System.out.println(x);
		//System.out.println(Example.x);
		System.out.println(e1.x);
		//System.out.println(e3.x);
		System.out.println();

		e1.a = 15;	e1.x = 16;

		System.out.println(e1.a);
		System.out.println(e2.a);
		System.out.println(e3.a);

		System.out.println(e1.x);
		System.out.println(e2.x);
		//System.out.println(e3.x);

		//System.out.println(e4.a);
		//System.out.println(e4.x);
/**/
	}
}