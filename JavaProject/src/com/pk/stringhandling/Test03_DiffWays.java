package com.pk.stringhandling;

public class Test03_DiffWays {
	public static void main(String[] args) {
		char[] ch= {'a','b','c','d','e'};
		System.out.println(ch);
		String s1="abcde";
		System.out.println(s1);
		StringBuffer sb1=new StringBuffer("abcde");
		System.out.println(sb1);
		StringBuilder sb2=new StringBuilder("abcde");
		System.out.println(sb2);
	}
}
