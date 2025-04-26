package com.pk.staticmembers;

class Test21_SMMMEF_TC3{
	static int a = m1();

	static int m1(){
		System.out.println("  m1 is executed");
		return 5;
	}

	public static void main(String[] args) {
		System.out.println("\nmm execution is started");

		System.out.println("mm execution is end");
	}

	static{
		System.out.println("SB execution is started");

		System.out.println("SB execution is end");
	}	

}


//SM is not executed automatically by JVM,
//Hence, the order of execution of SM and MM is depending on the order we called SM.

//If do not call SM, it is never executed, only MM is executed.
//If call SM in MM, First MM execution is started, in middle of MM execution SM is executed.
//If call SM in SB/SV assignment, first SM is executed and then MM is executed.
//In above case SM is executed before MM, because SV/SB are executed before MM