package com.pk.nsvnsmco;

class Test02 {	
	int x = 10;

	void m1(){                
		System.out.println(x);
		x  = 50;
	}

	public static void main(String[] args){
		Test02 t1 = new Test02();
		System.out.println(t1.x);

		t1.x = 30;
		System.out.println(t1.x);

		t1.m1();
		System.out.println(t1.x);
	}
}

