package com.pk.interfacerules;

public interface Example {
	int x=10;
	void m1();
		//class A() {}//ce:
			//static {}
			//{}
		//Example(){}ce: Interfaces cannot have constructors becoz we cannot create objects for interface
			static class c{}
			//void m2() {System.out.println("m2");}//ce: Abstract methods do not specify a body
			private static void m3() {
				System.out.println("m3");
			}
			private void m4() {
				System.out.println("m4");
			}
			default void m5() {	System.out.println("m5");}
			static void m6() {System.out.println("m6");}
			public static void main(String[] args) {
				System.out.println("main");
			}
			private static void m7() {System.out.println("m7");}
			private void m8() {System.out.println("m8");}
			//rule: 3
			//int y; ce: final field y may not have been initialized
			//rule: 4
			//private int a=10;
			int b=10;
			//protected int a=10; //ce: Illegal modifier for the interface field Example.a; only public, static & final are permitted
			public int d=30;
}

class Sample{
	public static void main(String[] args) {
		Example e1;
		//e1=new Example();
	}
}
//rule: 6
interface P{}
//final interface Q{}//ce: Illegal modifier for the interface Q; only public & abstract are permitted
abstract interface R{}
strictfp interface S{}//from java 8v onwards allowed java 17v onwards we will get warning
abstract strictfp interface Test08{}
interface M{}
interface N extends M{}
interface O extends P,M{}
//interface X implements M{}//ce: Syntax error on token "implements", permits expected
//class Y extends M{}//ce: The type M cannot be the superclass of Y; a superclass must be a class
class Z1 implements M{}
class Z2 implements N,M{}
//interface L extends Z1{}ce: The type Z1 cannot be a superinterface of L; a superinterface must be an interface
//interface L implements Z1{}ce: Syntax error on token "implements", permits expected
interface Abc{
	void m1();
}
/*class Bbc implements Abc{
	void m1() {
		System.out.println("m1");
	}*/
class Cbc implements Abc{
	public void m1() {}
}
class Dbc implements Abc{
	public void m1() {}
}
class Ebc implements Abc{
	public void m1() {
		System.out.println("m1");
	}
}










