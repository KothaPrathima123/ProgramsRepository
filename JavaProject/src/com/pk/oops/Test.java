package com.pk.oops;

//Rule #1:
interface Example04 {

//Rule #2:
	int x = 10; 
	void m1(); 
	class A{ }

	//static{ }
	//{ }								//in all version not allowed
	//Example(){ }
	//void m2(){ }
										 //from Java 8v onwards allowed
	default void m3(){ }
	static void m4(){ }						
	public static void main(String[] args){System.out.println("main"); } //Upto Java 7v not allowed
	
	private static void m5() { }		//From Java 9v onwards allowed
	private void m6() { }

//Rule #3:
	//int y  ;

//Rule #4:
	//private int a = 10;
	int b = 20;
	//protected int c = 30;
	public int d = 40;

	//private void m7();
	void m8();
	//protected void m9();
	public void m10();

	//private default void m8(){ }
	//protected default void m9(){ }
	/**/
}

	class Test {
		public static void main (String[] args) {

//Rule #5:
			Example e1;
			//e1 = new Example();
			//e1 = ???;
		}
	}

//Rule #6:
	interface P{ }
	//final interface Q{ }
	abstract interface R{ }
	//strictfp interface S{ }   //From Java 8v onwards allowed, Java 17v onwards we will get warning
	//public abstract strictfp interface Test09{ }

//what is a Marker interface? -->  empty interface  
	interface M { }  //it is meant for only providing type to implementation class
					//for allowing executing some special logic on its 
					//implementation class object
					//For example; Serializable and Cloneable interfaces 
					//are marker interfaces. They are meant for performing object 
					//Serialization and Cloning by other classes methods

//Rule #7: 
	interface N extends M { }
	interface O extends P, M { }

	//interface X  implements M { }

	//class Y extends M { };
	class Z1 implements M { };
	class Z2 implements N, M { };

	//interface L   extends     Z1{ }		//not possible
	//interface L   implements  Z1{ }		//not possible

//Rule #8:
	interface Abc {
		void m1();
	}

	//class Bbc implements Abc{ };   //do not call it as sub class
									//call it as "implementation class"

//Rule #9:
	//class Cbc implements Abc 	{
	//	void m1(){ } 
	//}

	class Dbc implements Abc{ 
		public void m1(){ }
	};

	class Ebc implements Abc{ 
		@Override
		public void m1(){ }
	};