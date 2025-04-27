package com.pk.stringhandling;

public class Test28_intern {
	public static void main(String[] args) {
		String s1="Hi";
		String s2=s1.intern();
		System.out.println(s1==s2);//true
		String s3=new String("Hello");
		String s4=s3.intern();
		String s5="Hello";
		String s6=new String("Hello").intern();
		System.out.println(s3==s4);//false
		System.out.println(s3==s5);//false
		System.out.println(s4==s5);//true
		System.out.println(s5==s6);//true
		String s7=new String("How Are You?");
		String s8=new String("How Are You?").intern();
		System.out.println(s7==s8);//false
	}
}
