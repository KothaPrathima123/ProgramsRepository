package com.pk.modifiers;

public class A {

	private		int a = 10;
				int b = 20;
	protected	int c = 30;
	public		int d = 40;

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("a1.a: "+ a1.a);
		System.out.println("a1.b: "+ a1.b);
		System.out.println("a1.c: "+ a1.c);
		System.out.println("a1.d: "+ a1.d);


	}
}
//Save above program with the name A.java in the folder 
//D:\02CJ-9AM\07 Modifiers & AMs

//Compilation 
/*
D:\02CJ-9AM\07 Modifiers & AMs>javac   -d    .  A.java
            A.java
			p1
			  A.class

D:\02CJ-9AM\07 Modifiers & AMs>java p1.A
10
20
30
40

*/
