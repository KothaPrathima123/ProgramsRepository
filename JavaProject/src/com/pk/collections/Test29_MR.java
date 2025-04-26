package com.pk.collections;

class AA {
	static void m1(int x, int y) {
		System.out.println("i,i: "+ (x + y));
	}
	
	static void m1(float x, float y) {
		System.out.println(x + y);
	}
	
	static void m1(String x, String y) {
		System.out.println(x + y);
	}
}

public class Test29_MR {
	public static void main(String[] args) {

		Addition a1 = (a, b) -> {AA.m1(a, b); };
		a1.calculate(10, 20);

		Addition a2 = AA::m1;
		a2.calculate(50, 60);
		
		//Name n1 = name -> System.out.println(name);
		Name n1 = System.out::println;
		n1.m1("PK");
		System.out.println();
	}
}

interface Name {
	void m1(String name);
}