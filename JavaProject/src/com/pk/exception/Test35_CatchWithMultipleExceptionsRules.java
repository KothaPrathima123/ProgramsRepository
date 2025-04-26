package com.pk.exception;

public class  Test35_CatchWithMultipleExceptionsRules{
	public static void main(String[] args) {
		try{
			
		}
//Rule #1: separator must be single  |		
		catch(ArrayIndexOutOfBoundsException | 	NumberFormatException e){	}//No exception of type Object can be thrown; an exception type must be a subclass of Throwable
		//catch(ArrayIndexOutOfBoundsException || 	NumberFormatException e){	}
		//catch(ArrayIndexOutOfBoundsException & 	NumberFormatException e){	}
		//catch(ArrayIndexOutOfBoundsException , 	NumberFormatException e){	}
		
//Rule #2: we must use only single parameter name
		//catch(ArrayIndexOutOfBoundsException e1 | 	NumberFormatException e2){	}

//Rule #3: Exception classes must be only siblings, must not be super and sub classes
		//catch(NumberFormatException | Exception 	e2){	}

	}
}