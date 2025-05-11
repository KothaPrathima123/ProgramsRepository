package com.pk.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		System.out.println("Enter two integer values: ");
		Scanner sc=new Scanner(System.in);
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("Result: "+c);
		}
		catch(InputMismatchException ie) {
			System.out.println("Please pass only integer");
		}
		catch(ArithmeticException ae) {
			System.out.println("Please Do not pass zero as second value");
		}
		
	}
}
