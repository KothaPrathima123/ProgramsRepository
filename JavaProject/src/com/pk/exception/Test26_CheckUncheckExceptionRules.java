package com.pk.exception;
class Test26 {
	static void m1()  {
		throw new ArithmeticException();			
	}

	static void m2()  {
      //throw new ClassNotFoundException();	
	}

	static void m3() {
		try{
			throw new ClassNotFoundException();		
		}catch(ClassNotFoundException e){
		                 
		}
	}

	static void m4() throws ClassNotFoundException { 
		throw new ClassNotFoundException();
	}
	
	static void m5() {
      	//m4();						
	}

	static void m6() {
		try{
			m4();													
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	static void m7() throws ClassNotFoundException {
		m4();							
	}

	public static void main(String[] args) throws ClassNotFoundException {
		m7();							
		System.out.println("main end");
	}

	static void m8() {
		try{ 		}
		catch(ArithmeticException e){  } 
		catch(NullPointerException e){  }
        //catch(ClassNotFoundException e){  }	
        //catch(InterruptedException e){  }		
		catch(Error e){  }
		catch(RuntimeException e){  }
		catch(Exception e){  }					
		catch(Throwable e){  }				
	}

	static void m81() {
		//throw new Exception();				
	}

	static void m82(){
		//throw new Throwable();
	}

	static void m9() throws ClassNotFoundException {
                                   
	}

	static void m10(){
     	//m9();  
	}

	static void m11() throws ClassNotFoundException{
		m9();
	}

	static void m12() throws ClassNotFoundException{
		try{	
			m9();
		}catch(ClassNotFoundException e){		}
	}
/**/
}



class P{
	void m1() { }
}

class Q extends P{
	void m1() { }
};

class R extends P{
	void m1() throws ArithmeticException { }
}

class S extends P {
	//void m1() throws ClassNotFoundException{ }
}

class T extends P{
	//void m1() throws Exception{ }
}

class MyException extends ClassNotFoundException {

}

class A {
	void m2() throws ClassNotFoundException {  }
}

class B extends A{
	void m2() {  }
}

class C extends A{
	void m2() throws ClassNotFoundException {  }
}

class D extends A{
	void m2() throws MyException {  }
}

class E extends A{
	//void m2() throws Exception {  }	
}

class F extends A{
	//void m2() throws InterruptedException {  }		
}

class G extends A{
	void m2() throws ClassNotFoundException 
					//,InterruptedException	
		{  }
}

class H extends A{
	void m2() throws ArithmeticException {  }
}

class I extends A{
	void m2() throws ClassNotFoundException, 
						ArithmeticException{  }
}

class J extends A{
	void m2() throws ClassNotFoundException, 
					   MyException{  }
}


class K extends A { 
	void m2() {
		//Thread.sleep(100);									
	}
};

class L extends A{ 
   // void m2() throws InterruptedException {		
   //	Thread.sleep(100);										
   //}
}

class M extends A { 
	void m2() {
		try{ throw new InterruptedException(); }									
		catch(InterruptedException e){	}
	}
}

class N extends A { 
	void m2() throws ClassNotFoundException {
		try{	
			throw new InterruptedException(); 
		}catch(InterruptedException e){
			//throw new ClassNotFoundException(e);  
		}
	}
}

class O extends A{ 
	void m2() {
		try{	
			throw new InterruptedException();
		}catch(InterruptedException e){
			throw new RuntimeException(e); 
		}															
	}																 
}

class Test26_CheckUncheckExceptionsRules   {
	public static void main(String[] args){
		try{	
			A a1 = new O();
			a1.m2();
			System.out.println("m2() is executed successfully");
		}catch(ClassNotFoundException e ){
			System.out.println("CNFE is raised");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("main end");
	}
}


class Example1 {
	Example1() throws InterruptedException {  }

	static int m1() throws ClassNotFoundException { 
		return 5;
	}
}

class Test04 {
	//static int a = Example.m1();
}

//class Test2 throws ClassNotFoundException
//{
//	static int a = Example.m1();
//}

//class Test3{ 		
//	try{
//		static int a = Example.m1();
//	}catch(ClassNotFoundException e){  }
//}

class Test4{
		static int a ;
		static {
//			a = Example.m1();
		}
}

class Test5{
		static int a ;
		static //throws ClassNotFoundException
		{
//			a = Example1.m1();
		}
}

class Test6	{
		static int a ;
		static {
			try{
				a = Example1.m1();
			}catch(ClassNotFoundException e){  } 
		}
}

class Test00 {
	//Example e1 = new Example();
}

//class Test01 throws InterruptedException{
//	Example e1 = new Example();
//}

class Test02 {
//	try{
//		Example e1 = new Example();
//	}catch(InterruptedException e){ };
}
	
class Test03 {
	static Example e1 ;
	Example e2 ;
	Example e3 ;
		
	static {
		try{
			e1 = new Example();
		}catch(Exception e){ }//ce: Unreachable catch block for InterruptedException. This exception is never thrown from the try statement body
	}

	{
		try{
			e2 = new Example();
		}
		//catch(InterruptedException e)//ce: Unreachable catch block for InterruptedException. This exception is never thrown from the try statement body
		catch(Exception e)
		{ }
	}

	Test03(){
		try{
			e3 = new Example();
		}
		//catch(InterruptedException e){ }//Unreachable catch block for InterruptedException. This exception is never thrown from the try statement body
	catch(Exception e) {
		e.printStackTrace();
	}
	}

	Test03(String s) throws InterruptedException {
			e1 = new Example();
	}
	
}

class Ex {
	Ex() throws InterruptedException {  
	
	}
}

//class Sa1 extends Ex{
                             
//}

class Sa2 extends Ex{
	Sa2() throws InterruptedException {
        
	}
}

//class Sa4 extends Ex	{
//	Sa4(){
//		try{
//			 super();
//		}catch(InterruptedException e){ }
//	}
//}

//class Sa5 extends Ex	{
//	Sa5(){
//		try{super();}
//		catch(InterruptedException e){ }
//	}
//}

class Sa3 extends Ex{
	Sa3() throws InterruptedException,
					ClassNotFoundException {
                                
	}
}

class Ex2{
	Ex2(){  }
	Ex2(String s) throws InterruptedException{ }
};

class Sa6 extends Ex2{
                             
};

class Sa7 extends Ex2{
	Sa7(){
//		super("a");
	}
};

class Sa8 extends Ex2{
	Sa8(String s){
                                        
	}
}


