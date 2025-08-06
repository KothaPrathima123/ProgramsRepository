package com.pk.exception;

class Test25_ThrowThrowsRules // throws ArithmeticException
{
	// throw new ArithmeticException();

	static // throws ArithmeticException//CE: Syntax error on token "throws", interface
			// expected
	{
		// throw new ArithmeticException();
	}

	{ // throws ArithmeticException//ce: Syntax error on tokens, delete these tokens
		// throw new ArithmeticException();//ce: Initializer does not complete normally
	}

	/*static {
		int a = 10;
		if (a == 10) {
			throw new ArithmeticException();
		}
	}
	
	{
		 if(true){ throw new ArithmeticException(); }
		 if(false){ throw new ArithmeticException(); }
	}
	
	
	static  
	{
		 try{ throw new ArithmeticException(); }
		 catch(ArithmeticException ae){ ae.printStackTrace(); }
	}
	
	{
		 try{ throw new ArithmeticException(); }
		 catch(ArithmeticException ae){ae.printStackTrace();}
	}
	
	Test25_ThrowThrowsRules() throws ArithmeticException{
		throw new ArithmeticException();
	}*/
	
	void m1() throws ArithmeticException{
		throw new ArithmeticException();
	}
	
	void m2()// throw ArithmeticException//ce:L Syntax error on token "throws", throw expected
	{
		//throws new ArithmeticException();	
	}
	
	void m3() // throws String //ce: No exception of type String can be thrown; an exception type must be a subclass of Throwable
	{
			//	throw "abc";//ce: No exception of type String can be thrown; an exception type must be a subclass of Throwable
	}
	
	void m4(){
		throw new ArithmeticException(); 
			//	System.out.println("Hi");//ce: Unreachable code
	}	
	
	void m5(){
		if(true){
			throw new ArithmeticException();
		}
		System.out.println("Hi");
	}
	
	void m6() throws ArithmeticException, 
						IllegalArgumentException {
		throw  new ArithmeticException();
			//, 
				//		new IllegalArgumentException();//ce: Unreachable code
	}
	
	
	
	void m7(int x) throws ArithmeticException, 
							IllegalArgumentException{
		throw new IllegalArgumentException(); 
			//	throw new ArithmeticException();ce: Unreachable code multiple throws are not allowed
	}
	
	void m8(int x) throws ArithmeticException, 
							IllegalArgumentException{
		if(x < 0){
			throw new IllegalArgumentException(); 
		}
	
		if (x == 0){
			throw new ArithmeticException(); 
		}
	
		System.out.println(x +" is correct value");
	}
	

	public static void main(String[] args) {
		Test25_ThrowThrowsRules exp= new Test25_ThrowThrowsRules();
		exp.m8(3);
	}
}