package com.pk.interfacerules;

abstract class A{}
	public abstract class Test06{}
	//final abstract class B{}
	//abstract abstract class C{}//ce: Duplicate modifier for the type C
	strictfp abstract class C{}
	abstract class D{
		//private abstract void m1();//ce: The abstract method m1 in type D can only set a visibility modifier, one of public or protected
		abstract void m2();
		protected abstract void m3();
		public abstract void m4();
		//static abstract void m5();//ce: The abstract method m5 in type D can only set a visibility modifier, one of public or protected
		//transient abstract void m5();
	//ce: Illegal modifier for the method m5; only public, protected, private, abstract, static, final, synchronized, native & strictfp are permitted
	//volatile abstract void m5();
		//synchronized abstract void m5();
		//strictfp abstract void m5();
		abstract int m6();
		abstract int[] m7();
		abstract String m8();
		abstract void m9() throws IllegalArgumentException;
		abstract int m10(int i) throws Exception;
	
}
abstract class Ex{
	private Ex() {
		System.out.println("Ex.Ex()");
	}
}
/*class Sa extends Ex{
	//ce: Implicit super constructor Ex() is not visible for default constructor. Must define an explicit constructor
}*/
