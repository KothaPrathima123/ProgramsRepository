package com.pk.stringhandling;

public class Test16_trim {
	public static void main(String[] args) {
		String s1="abc bbc";
		System.out.println(s1.length());
		s1.trim();
		System.out.println(s1.length());
		System.out.println();
		String s2=s1.trim();
		System.out.println(s1.length());//7
		System.out.println(s2.length());//7
		System.out.println();
		String s3=s2.trim();
		System.out.println(s2==s3);//true
		String s4=s1.replace(" ", "");
		System.out.println(s4.length());//6
		String s5=s1.replace(" ", "");
		System.out.println(s5.length());//6
		System.out.println();
		String s6=s1.trim();
		String s7=s1.trim();
		System.out.println(s6==s7);//true
		String s8=s6.trim();
		System.out.println(s6==s8);//true
		
		
	}
}
