package com.pk.staticmembers;

class Test21_SVSMMM_EF_TC2{
	static int a = m1();

	static int m1(){
		System.out.println("SV is executed");
		System.out.println("m1 is executed");
		return 50;
	}
	static void m2(){
		System.out.println("m2 is executed");
	}
	public static void main(String[] args){
		System.out.println("MM is executed");
		m2();
	}
}

//here m2() method is executed after MM 