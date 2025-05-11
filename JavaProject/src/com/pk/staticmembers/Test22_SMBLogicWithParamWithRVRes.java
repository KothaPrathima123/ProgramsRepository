package com.pk.staticmembers;

import java.util.Scanner;
class Addition {
	static int add(int a, int b){
		System.out.println("\n  add execution is started");


			
			int c  = a + b;
			System.out.println("  addition logic is executed");
			System.out.println("  add execution is end\n");

			return c;		

	}
}



public class Test22_SMBLogicWithParamWithRVRes{
	public static void main(String[] args) {
		System.out.println("mm execution is started");

		Scanner scn = new Scanner(System.in);
		System.out.println("Connection is created to KB");

		System.out.println("Reading values");
			System.out.print(" Enter FNO: ");
			int a = scn.nextInt();

			System.out.print(" Enter SNO: ");
			int b = scn.nextInt();

			System.out.println(
				" add method is called \n by passing given values "+a +" and "+b);
			int res = Addition.add(a, b);
			System.out.println("Result: "+ res);
		System.out.println("mm execution is end");
	}
}