package com.pk.staticmembers;

class A{
	static int a1 = 10;
	static int a2 = 20;		
}

class B{
	int a1 = 10;			
	int a2 = 20;
}

class C{
	static int a1 = 10;
	int a = 20;
}

class D {

	static int a = 10;

	static void m1(){
		int a = 10;
	}

	static void m2(){
		int a = 10;
	}

	static void m3(){
		int a = 10;
		int a1 = 10;
	}

	static void m4(){
		int a = 10;
		a = 20;
	}

	static void m5(int a){

	}

	static void m6(int a){

	}

	static void m7(int a, int a1){

	}

	static void m8(int a){
		int a1 = 10;
	}

	static void m9(int a){
		a = 70;
	}

	static void m10(){
               
		System.out.println(a);
	}
/* */
}
