package com.pk.nsv;

class Example {
	int x = 10;
	int y = 20;
}

class Test01{
	public static void main(String[] args) {
		//int[] type variable declaration
		int[] ia1;

		//int[] type variable definition
		int[] ia2 = new int[5];

		//int[] variable assignment
		ia1 = new int[7];

		//reading accessing array referenced variable to display its value
		System.out.println(ia1);
		System.out.println(ia2);
		System.out.println();

		//Example class type ref var declaration
		Example e1;

		//Example class type ref var definition
		Example e2 = new Example();

		//Example class type ref var assignment
		e1 = new Example();

		//accessing referenced variable 
		System.out.println(e1);
		System.out.println(e2);
		System.out.println();

		String s1 = "Hari";
		System.out.println(s1);

	}
}
