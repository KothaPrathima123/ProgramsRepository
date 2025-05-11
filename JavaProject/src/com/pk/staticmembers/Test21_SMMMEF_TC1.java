package com.pk.staticmembers;

class Test21_SMMMEF_TC1{
	static void m1(){
		System.out.println("  m1 is executed");
	}

	public static void main(String[] args) {
		System.out.println("mm execution is started");
		m1();
		System.out.println("mm execution is end");
	}

}