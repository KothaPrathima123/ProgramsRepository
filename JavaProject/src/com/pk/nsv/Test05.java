package com.pk.nsv;

class Example_05{
	int x;
	int y;
}

class Test05 {
	public static void main(String[] args) {
		//empty referenced varaible
		Example_05 e1;
		//System.out.println(e1);ce: e1 may not be initialized
		//System.out.println(e1.x);

		//null referenced variable
		Example_05 e2 = null;
		System.out.println(e2);//null
		System.out.println(e2.x);//RE: NullPointerException

	}
}