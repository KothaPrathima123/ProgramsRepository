package com.pk.exception;

public class NegativeNumberException extends Exception {
	
	NegativeNumberException(){
		super();
	}

	NegativeNumberException(String msg){
		super(msg);
	}

}