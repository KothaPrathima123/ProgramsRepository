package com.pk.modifiers;
class  Test02{
	public static void main(String[] args) {
//Rule  #1:
		//a  = 10;
		int a  = 10;		//9v

		var x = 10;		//10v : Local Variable type inference
		
		x = 20;
		x = 'a';
 //		x = 5L;
 //		x = 6.7;
 //		x  = true;
		System.out.println(x);//97

		var y = 6.7;
		System.out.println(y);//6.7
		y  = 5;
		y  = 9.3;
		y  = 'a';
 //		y  = true;
 //		y  = "a";
		
		var z  = true;
		System.out.println(z);//true

		int[] ia1 = new int[5];			 //9v
		var   ia2 = new int[5];			//10v
		System.out.println(ia1);//[I@5ca881b5
		System.out.println(ia2);//[I@24d46ca6
		//ia2 = "a";

		Example e1 = new Example();		//9v
		var e2 = new Example();			//10v
		System.out.println(e1);//com.pk.modifiers.Example@372f7a8d
		System.out.println(e2);//com.pk.modifiers.Example@2f92e0f4
		//e2 = "a";

		var o1 = new Object();		//super class of all types
		o1 = 5;
		o1 = 6.7;
		o1 = 'a';
		o1 = true;
		o1 = "a";
		o1 = new Example();
		o1 = new int[5];
		o1 = null;

 //Note:
		var var = 'a';
		System.out.println(var);//a
		var = 98;
		var = 65000;
 //		var = 67000;


//Rule #2:

	//	var i1;	


//Rule #3:
		var s1 = "a";
		var s2 = new String("a");
		var e3 = new Example();
		var ia = new int[5];
		var ea = new Example[5];
	
 //		var e	= null;	  
 //		var ia2 = {5, 6, 7};  

		int[] ia3 = {5, 6, 7};
		var ia4 = new int[]{5, 6, 7};  

 //		var p = m1();
		var q = m2();

 //		var runnable = () -> { System.out.println("run"); };

 //		var string	= String::valueOf;


//Rule #4:
 //		var[] ia = new int[5];  
 //		var ia[] = new int[5];  
 //		var var[] = new int[5];	

 //			var i7;
 //			i7 = 5;
/**/
	}

	static void m1(){ }
	static int m2(){ return 5;}
}

class A11{

	//Rule #5:
		//	static var a = 10;		
		//	var x = 10;				
		//	void m1( var p ){ }	
		//	var m2(){  }		
		//  var Ex{ }
}

//Rule #6:
class B11{
		int var = 10;
		void var(){  }

		//class var{ }  // CE: 'var' not allowed here						
								//as of release 10, 'var' is a 
								//restricted local variable type and 
								//cannot be used for type declarations

								//because compiler will get confusion
								//in variable creation var x = 10;
								//compiler can not take decision to consider
								//var as speical identifier or as class name

	//var e1 = new var();
	//cn rvn = new cn():

}
