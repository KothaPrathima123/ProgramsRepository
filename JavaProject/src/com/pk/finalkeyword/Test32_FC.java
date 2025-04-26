package com.pk.finalkeyword;

final class Ex1{
	int x=10;
	final int y=10;
	void m1() {
		System.out.println("m2 from Ex1");
	}
	final void m2() {
		System.out.println("m2 from Ex1");
	}
}
public class Test32_FC{
	public static void main(String[] args) {
		Ex1 ex=new Ex1();
		System.out.println("ex.x: "+ex.x);//10
		System.out.println("ex.y: "+ex.y);//10
		ex.x=15;
		//ex.y=16;//ce: the final field Ex1.y cannot be assigned
		System.out.println("ex.x: "+ex.x);//15
		System.out.println("ex.y: "+ex.y);//10
		ex.m1();//m2 from Ex1
		ex.m2();//m2 from Ex1
	}
}
