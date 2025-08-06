package com.pk.basics;

//TestNumberType.java
import java.util.Scanner;
class TestNumberType {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = scn.nextInt();

		boolean even = NumberTypeFinder.isEven(num);

		if(even){
			System.out.printf(
				"The number %d is Even\n", num);
		}
		else{		
			System.out.printf(
				"The number %d is Odd\n", num);
		}

	}
}
