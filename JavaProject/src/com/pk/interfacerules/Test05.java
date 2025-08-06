package com.pk.interfacerules;

abstract class Example4{
	abstract void m1();
	static int a=m2();
	static int m2() {
		System.out.println("Example4.m2()");
		return 2;
	}
	static {
		System.out.println("Example4.enclosing_method()(static block)");
	}
	static void m3() {
		System.out.println("Example4 class static method");
	}
	public static void main(String[] args) {
		System.out.println("Example4 main method");
		m3();
		System.out.println(a);
		//Example4 e=new Example4();//ce Cannot instantiate the type Example4
	}
	int x=m4();
	int m4() {
		System.out.println("Example4 class non static method");
		return 3;
	}
	{
		System.out.println("Example4 class non static block");
	}
	public Example4() {
		System.out.println("Example4 class Non parameterized constructor");
	}
	void m5() {
		System.out.println("Example4 class non static method");
	}
}
class Sample4 extends Example4{

	@Override
	void m1() {
		System.out.println("m1 is executed from Sample4");
	}
}
public class Test05{
	public static void main(String[] args) {
		Example4 e1=new Sample4();
		e1.m1();
		e1.m3();
		//output
	    //Example4.m2()
		//Example4.enclosing_method()(static block)
		//Example4 class non static method
		//Example4 class non static block
		//Example4 class Non parameterized constructor
		//m1 is executed from Sample4
		//Example4 class static method
	
	}
}