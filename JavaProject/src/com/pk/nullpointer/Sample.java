package com.pk.nullpointer;
class Example {
	int x = 10;
	int y = 20;

	public static void main(String[] args){
		
		//System.out.println(null.x);  //CE: <null> can not be dereferenced
		
		m1(null); //no error, output: null		
													System.out.println();
		//m2(null); //CE: ambiguous error

		String s2 = null;			
		m2(s2);		
		m2((String)null);
													System.out.println();
		Example e3 = null;		
		m2(e3);		
		m2((Example)null);
		
/**/
	}//main method close

	static void m1(String s){
		System.out.println("m1(String): "+ s);
	}

	static void m2(String s){
			System.out.println("String param method: "+ s);
	}
	static void m2(Example e){
			System.out.println("Example param method: "+ e);
	}
}


public class Sample {
	public static void main(String[] args) {
		//System.out.println(5, 6);
		
		System.out.println(10);		
		System.out.println(10.5);		
		System.out.println('a');		
		System.out.println(true);		

		//System.out.println(null);		//CE: ambiguous error
		
		String s = null;				//here null is of type String
		System.out.println(s);			//no CE, no RE, 
		System.out.println((String)null);//no CE, no RE, 
											//println(String) param method is executed 
											//O/P: null is displayed

		//System.out.println((char[])null);	//no CE, RE: NPE

		Example e = null;
		int[] ia = null;

		System.out.println(e);	//println(Example)	-> println(Object) -> null
		System.out.println(ia);	//println(int[])	-> println(Object) -> null
/**/	
	}
}