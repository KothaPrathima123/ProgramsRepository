package com.pk.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		while(true) {
			try {
				System.out.println("Enter fno: ");
				a=sc.nextInt();
				break;
			}
			catch(InputMismatchException ie) {
				System.out.println("Please Enter Only Integer");
				sc.nextLine();
			}
		}
		while(true) {
			try {
				System.out.println("Enter sno: ");
				int b=sc.nextInt();
				int c=a/b;
				System.out.println("Result: "+c);
				break;
			}
			catch(InputMismatchException ie) {
				System.out.println("Please Enter Only Integer");
				sc.nextLine();
			}
			catch(ArithmeticException ae) {
				System.out.println("Please Donnot Pass Zero as second value");
			}
		}
		
	}
}
