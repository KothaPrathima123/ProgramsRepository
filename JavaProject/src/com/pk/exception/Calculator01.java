package com.pk.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeNumberException extends Exception {
	
	NegativeNumberException(){
		super();
	}

	NegativeNumberException(String msg){
		super(msg);
	}

}
class Addition01 {
	static int add(int a, int b) 
						throws NegativeNumberException {

		if(a < 0  || b < 0)
			throw new NegativeNumberException(
							"Do not pass -ve numbers");
		

		return a + b;
	}
}

class Calculator01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while(true) {		
			try{	
				System.out.print("\nEnter FNO: ");
				int a = scn.nextInt();

				System.out.print("Enter SNO: ");
				int b = scn.nextInt();

				int c = Addition01.add( a , b);
				System.out.println("Result: "+c);

			}catch(InputMismatchException e){
				System.out.println("Please pass only integer");
				scn.nextLine();
			}catch(NegativeNumberException e){
				System.out.println(e.getMessage());
			}
		}//while close
    
	}
}


