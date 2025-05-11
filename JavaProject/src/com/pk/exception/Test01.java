package com.pk.exception;

import java.io.FileNotFoundException;
import java.io.PrintStream;


public class Test01 {
	
	public static void main(String[] args) throws FileNotFoundException {
		/*try(PrintStream ps=new PrintStream(System.out);){
			ps.println("Hi");
		}*/
		try(PrintStream ps=new PrintStream("abc.txt");){
			//ps=new PrintStream("bbc.txt");//we cannot reassign ps
			//ps=null; //we cannot assign null to ps
		}
		
		
		/*finally {
			ps.close();//ce: ps cannot be resolved to a type
		}*/
	}
}
