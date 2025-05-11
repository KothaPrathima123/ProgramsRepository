package com.pk.staticmembers;

class Test21_MulSMCallExeProof{
	static void m1(){
		System.out.println("  m1 is executed");
	}

	static void m2(){
		System.out.println("  m2 is executed");
	}

	public static void main(String[] args) {
		System.out.println("mm execution is started");
			m2();

			try{Thread.sleep(10000);}
			catch(InterruptedException e){ }

			m1();
		System.out.println("mm execution is end");
	}

}

//For performing differeent operations we must define multiple static methods
// one static method per operation

//All static methods are executed only when we call and based on the order we in call.

//All static methods logic is stored in MA in their class context,
//their logic is executed in JSA in main thread by creating separate SF

//When we call a SM multiple times or when we call diff SMs
//every time method logic is loaded from MA to JSA, but not from HardDisk
//all SMs are already loaded and available in JVM when class is loaded in to JVM.

//Even though we did not call methods, when class is loaded all those not called methods
//are also loaded into JVM.
