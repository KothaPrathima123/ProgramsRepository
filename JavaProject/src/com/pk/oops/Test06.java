package com.pk.oops;


abstract class A{ }						//pri, def, prot, pub	//st, fi, ab, na,    tr, vo, sy, sfp  //interface
public abstract class Test06{ }			//default, public, final, abstract, strictfp	
//final abstract class B{ }					
//abstract abstract class C{ }									
//strictfp abstract class C{ }									//default, public, strictfp

abstract class D{									
															
	//private   abstract void m1();			//private, default, protected, public
	                abstract void m2();			//static, final, abstract, native
	protected abstract void m3();			//synchronized, strictfp*
	public      abstract void m4();

	//static abstract void m5();				//default, protected, public
	//final abstract void m5();
	//abstract abstract void m5();
	//native abstract void m5();

	//transient abstract void m5();
	//volatile abstract void m5();
	//synchronized abstract void m5();
	//strictfp abstract void m5();

	abstract int m6();
	abstract int[] m7();
	abstract String m8();

	abstract void m9(int i);
	abstract void m10(int[] i);
	abstract void m11(String i);

	abstract void m12() throws IllegalArgumentException;

	abstract int  m13(int i) throws Exception;
};

abstract class Example03{ 
	private Example03(){}

	
}

//class Sample extends Example
//{
	
//}
