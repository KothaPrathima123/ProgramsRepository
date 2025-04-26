package com.pk.finalkeyword;

/*class Ex {
	static final int a=10;//compile will replace the value when we access in other class
	static {
		System.out.println("Ex is loaded");
	}
}*/
class Ex {
	static final int a;
	static {
		a=10;
		System.out.println("Ex is loaded");//here compiler will leave as it is and jvm will load the Ex class
	}
}
public class Sa{
	static {
		System.out.println("Sa is loaded");
	}
	public static void main(String[] args) {
		System.out.println("Sa main start");
		System.out.println("a: "+Ex.a);//10
		System.out.println("Sa main end");
		
	}
}
