package com.pk.stringhandling;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args) {
		String s1="";
		String s2=" ";
		String s3="abc";
		String s4=new String();
		String s5=new String("");
		String s6=new String(" ");
		String s7=new String("abc");
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
		System.out.println(s4.isEmpty());
		System.out.println(s5.isEmpty());
		System.out.println(s6.isEmpty());
		System.out.println(s7.isEmpty());
		System.out.println(s2.trim().isEmpty());//upto java 10v
		System.out.println(s2.isBlank());
		System.out.println(s1.isBlank());
		System.out.println();
		String s8="a";
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println();
		System.out.println(s1.length()==0);
		System.out.println(s1.length()!=0);
		if(s1.isEmpty()) {}
		if(s1.length()==0) {}
		String[] sa={"a","b","c"};
		System.out.println(sa.length);
		String s10="krishna";
		StringEx ex=new StringEx(3);
		System.out.println(s10);
		System.out.println(ex);
		String s11;
		//System.out.println(s11.isEmpty());//ce: The local variable s11 may not have been initialized
		//System.out.println(s11.isBlank());
		//System.out.println(s11.length());
		String s12=null;
		//System.out.println(s12.isEmpty());//RE: NullPointerException
		//System.out.println(s12.isBlank());//RE: NullPointerException
		//System.out.println(s12.length());//RE: NullPointerException
		String s13=null;
		//System.out.println(s13.isEmpty());
		//System.out.println(s13.isBlank());
		//System.out.println(s13.length());
		Scanner sc=new Scanner(System.in);
		String s14=sc.nextLine();
		System.out.println(s14.isEmpty());
		System.out.println(s14.isBlank());
		System.out.println(s14.length());
		String s15="krishna";
		System.out.println(s15=="krishna");
		System.out.println(s15.equals("krishna"));
		String s16=new String("krishna");
		System.out.println(s16=="krishna");
		System.out.println(s16.equals("krishna"));
		String s17=new String("krishna");
		System.out.println(s17=="krishna");
		System.out.println(s17.equals("krishna"));
		System.out.println(s17.equalsIgnoreCase("krishna"));
		String s19="a";
		String s20="a";
		System.out.println("s19==s20"+s19==s20);
		System.out.println("s19==s20"+(s19==s20));
		String s21="abc";
		StringBuffer sb1=new StringBuffer("abc");
		StringBuilder sb2=new StringBuilder("abc");
		System.out.println(s21.equals(sb1));
		System.out.println(s21.equals(sb2));
		System.out.println(s21.equals(sb2.toString()));
		System.out.println(s21.contentEquals(sb1));
		System.out.println(s21.contentEquals(sb2));
		StringBuffer sb3=new StringBuffer("abc");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(sb3));
		//System.out.println(sb1.equalsIgnoreCase(sb2));//ce: The method equalsIgnoreCase(StringBuilder) is undefined for the type StringBuffer
		//System.out.println(sb1.contentEqualsCase(sb3));//ce: The method contentEqualsCase(StringBuffer) is undefined for the type StringBuffer
		String s22="abc";
		String s23="abc";
		String s24="aBC";
		System.out.println(s22==s23);
		System.out.println(s22.equals(s23));
		System.out.println(s22.compareTo(s23));
		System.out.println(s22.equals(s24));
		System.out.println(s22.compareTo(s24));
		System.out.println(s22.compareToIgnoreCase(s24));
		String s25="abcdef";
		System.out.println(s22.equals(s25));
		System.out.println(s22.compareTo(s25));
		System.out.println(s22.compareToIgnoreCase(s25));
		System.out.println(s25.equals(s22));
		System.out.println(s25.compareTo(s22));
		System.out.println(s25.compareToIgnoreCase(s22));
		System.out.println(s24.compareToIgnoreCase(s22));
		String s26="Java Object-Oriented Programming Language";
		System.out.println(s26.equals("Program"));
		System.out.println(s26.compareTo("Program"));
		System.out.println(s26.contains("Program"));
		System.out.println(s26.concat("program"));
		System.out.println(s26.toLowerCase().contains("program"));
		System.out.println(s26.contains("j"));
		System.out.println(s26.contains("J"));
		System.out.println(s26.indexOf('J'));
		System.out.println(s26.indexOf('a'));
		System.out.println(s26.lastIndexOf('a'));
		System.out.println(s26.indexOf('a',5));
		System.out.println(s26.lastIndexOf('a'));
		System.out.println(s26.indexOf('A'));
		System.out.println(s26.lastIndexOf('A'));
		System.out.println();
		System.out.println(s26.indexOf('a',-5));
		System.out.println(s26.lastIndexOf('a',-5));
		System.out.println(s26.lastIndexOf('a',-25));
		System.out.println(s26.lastIndexOf('a',25));
		System.out.println(s26.indexOf('a',1));
		System.out.println(s26.lastIndexOf('a',1));
		System.out.println(s26.indexOf("Program"));
		System.out.println(s26.lastIndexOf("Program"));
		if(s26.contains("Program")) {
			System.out.println("available");
		} else {
			System.out.println("not available");
		}
		String s27="abc bbc cbc";
		System.out.println(s27.equals("abc"));
		System.out.println(s27.compareTo("abc"));
		System.out.println(s27.contains("abc"));
		System.out.println(s27.contains("bbc"));
		System.out.println(s27.startsWith("abc"));
		System.out.println(s27.endsWith("abc"));
		String s28="krishna";
		System.out.println(s28.length());
		System.out.println(s28.charAt(1));
		System.out.println(s28.charAt(11));
		System.out.println(s28.charAt(12));
		System.out.println(s8.charAt(-5));
		System.out.println();
		for(int i=0;i<s28.length();i++) {
			System.out.println(s28.charAt(i));
		}
		System.out.println(s28.substring(5));
		System.out.println(s28.substring(5,9));
		System.out.println(s28.substring(5,10));
		System.out.println(s28.substring(-5,10));//StringIndexOutOfBoundException
		System.out.println(s28.substring(5,12));
		System.out.println(s28.substring(5,5));
		String s29="Krishna;balayya;pavankalyan";
		String[] sa1=s29.split("a");
		System.out.println(Arrays.toString(sa1));
		System.out.println();
		sa1=s29.split("a");
		System.out.println(sa1.length);
		System.out.println(Arrays.toString(sa1));
		System.out.println();
		sa1=s29.split("A");
		System.out.println(sa.length);
		System.out.println(Arrays.toString(sa1));
		s29.split("Krishna;balayya;pavankalyan");
		System.out.println(sa.length);
		System.out.println(Arrays.toString(sa1));
		System.out.println();
		sa1=s29.split("K");
		System.out.println(sa1.length);
		System.out.println(Arrays.toString(sa1));
		sa1=s29.split("abc");
		System.out.println(sa1.length);
		System.out.println(Arrays.toString(sa1));
		sa1=s29.split("abc");
		System.out.println();
		System.out.println(Arrays.toString(sa1));
		sa1=s29.split(" ");
		System.out.println(sa1.length);
		System.out.println(Arrays.toString(sa1));
		s29="aaaaaa";
		sa1=s29.split("a");
		System.out.println(sa1.length);
		System.out.println(Arrays.toString(sa1));
		s29="abc.txt";
		sa1=s29.split(".");
		System.out.println(Arrays.toString(sa1));
		System.out.println();
		sa1=s29.split("\\.");
		System.out.println(s29.length());
		System.out.println(Arrays.toString(sa1));
		sa1=s29.split("[a-z]");
		System.out.println();
		System.out.println(Arrays.toString(sa1));
		//sa1="abc";
		sa1=s29.split("");
		System.out.println(sa1.length);
		System.out.println(Arrays.toString(sa1));
		sa1=s29.split("\\");
	}
}
