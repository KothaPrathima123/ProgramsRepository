package com.pk.modifiers;

class Test01{

	int a = 10;  //does not have memory directly, 
				 //has memory only when object is created

	static int b = 20;  //it has memory directly without creating object
						//default behaviour of the varibel is changed
						//by the keyword static, so it is modifier

    static int c = 30; //it is static variable, it has memory 
						//also we can change its value

    static final int d = 40; //default behaviour of the variable 
							  //got modified by the keyword final
							  //so we can call final is a modifier keyword
							  //because of final we can not change its value
							  
	public static void main(String[] args) {
		//System.out.println(a); CE

		System.out.println(b);  //20

		c = 40; //changing value, allowed
		System.out.println(c);  //40

		//d = 50; //CE
	}
}