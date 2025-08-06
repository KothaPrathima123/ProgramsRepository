package com.pk.exception;

import java.util.Scanner;

class Ex1{
	void m1(int x) throws IllegalArgumentException,IllegalStateException{
		if(x<0) {
			throw new IllegalArgumentException("Do not pass negative number");
		}
		if(x%2!=0) {
			throw new IllegalStateException("Do not pass odd number");
		}
		System.out.println("business logic goes here");
	}
}

public class TestThrow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ex1 e1=new Ex1();
		while(true) {
			try {
				System.out.println("Enter num: ");
				int x=sc.nextInt();
				e1.m1(x);
			}
			catch(IllegalArgumentException iae) {
				System.out.println(iae.getMessage());
			}
		}
	}
}
