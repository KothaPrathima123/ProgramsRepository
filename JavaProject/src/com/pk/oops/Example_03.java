package com.pk.oops;

public abstract class Example_03 {							//>javac Example.java
	abstract void m1();								//>java Example

	static int a = m2();
	static int m2(){
		System.out.println("Ex class SV");
		return 50;
	}
	static{
		System.out.println("Ex class SB");
	}
	static void m3(){
		System.out.println("Ex class SM");
	}
	public static void main(String[] args){//Ex class SV
		//Ex class SB
		//Ex class MM
		//50
		//Ex class SM
		System.out.println("Ex class MM");
		System.out.println(a);
		m3();
		//Example e1 = new Example();
	}

	int x = m4();
	int m4(){
		System.out.println("Ex class NSV");
		return 60;
	}

	{
		System.out.println("Ex class NSB");
	}

	Example_03(){
		System.out.println("Ex class NPC");
	}

	void m5(){
		System.out.println("Ex class NSM");
	}
}

class Sample03 extends Example_03{
	void m1(){
		System.out.println("m1 is executed from Sample");
	}
}
