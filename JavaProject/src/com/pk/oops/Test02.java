package com.pk.oops;
/*
abstract class Example01 {
	abstract void m1();
	abstract void m2();
}

abstract class Sample01 extends Example01 {
    void m1(){ System.out.println("m1 is executed from Sample for  "+ this + " object");}
}

class Xyz extends Sample {
	void m2() {	System.out.println("m2 from Xyz");}
}

class Pqr extends Sample{
	void m2(){ System.out.println("m2 from Pqr");}
}

class Test02  {
	public static void main(String[] args) {
			Example01 e1;

			//e1 = new Example();
			//e1 = new Sample();

			//e1 = new Xyz();
			e1.m1();
			e1.m2();

			//e1 = new Pqr();
			e1.m1();
			e1.m2();
	}
}*/
abstract class Example01 {
	abstract void m1();
	abstract void m2();
}

abstract class Sample01 extends Example01{
	void m1(){
		System.out.println("m1 is executed from Sample class");
	}

	abstract void m3();
}

class Xyz extends Sample01{
	void m2(){
		System.out.println("m2 is executed from Xyz class");
		m3();
		m4();
	}

	void m3(){
		System.out.println("m3 is executed from Xyz class");
	}

	void m4(){
		System.out.println("m4 is executed from Xyz class");
	}
}

class Test02{
	public static void main(String[] args){
		Example01 e1 = new Xyz();
		e1.m1(); 
		e1.m2(); 

		//e1.m3();
		//e1.m4();

		((Sample01)e1).m3();     //TC and SB, chance to get CCE
		//((Sample)e1).m4();	CE:

		((Xyz)e1).m4();			//TC and SB	, chance to get CCE
/**/

	}
}