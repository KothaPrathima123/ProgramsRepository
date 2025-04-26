package com.pk.modifiers;
class  B {
	public static void main(String[] args) {
		A a1 = new A();
		//System.out.println("a1.a: "+ a1.a); CE: a has private access in A
		System.out.println("a1.b: "+ a1.b);
		System.out.println("a1.c: "+ a1.c);
		System.out.println("a1.d: "+ a1.d);
	}
}

//Save above program the same folder "07 Modifiers"
//cmd>javac -d . B.java
/*
     07Modifiers
	    A.java
		B.java
		p1
          A.class
		  B.class
*/
//cmd>java  p1.B
/*
Output
20
30
40
*/
