package com.pk.nsvnsmco;

class Test01 {	
	int x = 10;
                
	void m1(){               

		System.out.println(x);
	}

	public static void main(String[] args){
		Test01 t1 = new Test01();
		Test01 t2 = new Test01();

		t1.x = 15;
		t2.x = 16;

		t1.m1();
		t2.m1();
	}
}