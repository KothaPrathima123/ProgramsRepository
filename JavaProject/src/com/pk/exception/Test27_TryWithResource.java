package com.pk.exception;
import java.io.PrintStream;
class Test27_TryWithResource{
	public static void main(String[] args){
		System.out.println("before try-with-resource");

		try( PrintStream ps = new PrintStream(System.out) ){
			ps.println("Hi");
		}

		System.out.println("after try-with-resource");
	}
}