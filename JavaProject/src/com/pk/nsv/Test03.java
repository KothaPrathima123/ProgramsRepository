package com.pk.nsv;

class Example_02{
	int x;
	int y;
}

class Sample_02{
	static Example_02 e1 = new Example_02();							
	Example_02 e2 = new Example_02();									

	void m1(Example_02 e3){			
		Example_02 e4 = new Example_02();								
	}
}

public class  Test03{
	public static void main(String[] args) {
		Sample_02 s1 = new Sample_02();
		s1.m1(new Example_02());
	}
}