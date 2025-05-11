package com.pk.staticmembers;
class Test21_SMMMEF_TC2{
	static void m1(){
		System.out.println("  m1 is executed");
	}

	public static void main(String[] args) {
		System.out.println("\nmm execution is started");
                           
		System.out.println("mm execution is end");
	}

	static{
		System.out.println("SB execution is started");
		m1();
		System.out.println("SB execution is end");
	}

}