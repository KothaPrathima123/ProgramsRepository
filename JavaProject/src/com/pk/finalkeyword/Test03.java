package com.pk.finalkeyword;

import java.util.Scanner;

public class Test03 {
	static final int a=10;
	static final int b;
	static {
		System.out.println("SB exec start");
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		System.out.println("SB exe end");
	}
	public static void main(String[] args) {
		Test03 test=new Test03();
		System.out.println(a);
		System.out.println(b);
	}
}
