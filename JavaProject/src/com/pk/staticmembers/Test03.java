package com.pk.staticmembers;
//From Java 5v onwards we can apply static keyword to import statement also
//then this import statement is called "static import" statement
//bur we must add static "after import" keyword

import  static  java.lang.System.*;	//static import	

class Test_03 {    //outer class

	static int a ;	//static field

	static {															//static block

	}

	static void m1(){//static method

	}
	
	public static void main(String[] args) {//main method

	}

//ICs
	static interface I{}	//static inner classes
	static abstract class AC{ }
	static class CC{ }
	static final class FC{ }
	static enum E{}
	static @interface A{ }

}
