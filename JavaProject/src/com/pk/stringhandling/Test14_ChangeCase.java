package com.pk.stringhandling;

public class Test14_ChangeCase{
	public static void main(String[] args) {
		String s1="aBc";
		System.out.println(s1);
		s1.toUpperCase();
		System.out.println(s1);
		System.out.println();
		String s2=s1.toUpperCase();
		String s3=s1.toLowerCase(); 
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		String s4=s1.toLowerCase();
		System.out.println(s4);
		s1=s1.toLowerCase();
		System.out.println(s1);
		String s5=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s5);
		System.out.println(s1==s5);
		System.out.println();
		String s6=s1.toUpperCase();
		String s7=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s6==s7);
		System.out.println(s1.equals(s6));
		System.out.println(s1.equals(s7));
		System.out.println(s6.equals(s7));
		String s8="12@34";
		String s9=s7.toLowerCase();
		String s10=s7.toUpperCase();
		System.out.println(s10);
		System.out.println(s8==s9);
		System.out.println(s9==s10);
		String s11="PqR";
		String s12=s11.toUpperCase();
		String s13=s11.toUpperCase();
		System.out.println(s11);
		System.out.println(s12);
		System.out.println(s13);
		System.out.println();
		System.out.println(s10.toUpperCase());
		System.out.println(s10);
		String str1=null;
		//System.out.println(str1.toUpperCase());
		String str2="null";
		System.out.println(str2.toUpperCase());
		String[] sa=new String[5];
		//System.out.println(sa[0].toUpperCase());
		
 	}
}
