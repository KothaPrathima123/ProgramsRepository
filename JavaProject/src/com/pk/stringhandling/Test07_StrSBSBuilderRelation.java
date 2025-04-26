package com.pk.stringhandling;

public class Test07_StrSBSBuilderRelation {
	public static void main(String[] args) {
		String str="Jai";
		//StringBuffer sb1="jai";ce:Type mismatch: cannot convert from String to StringBuffer
		//StringBuilder sb2="Jai";ce: Type mismatch: cannot convert from String to StringBuilder
		StringBuffer sb3=new StringBuffer("'");
		StringBuilder sb4=new StringBuilder("'");
		System.out.println(str);
		System.out.println(sb3);
		System.out.println(sb4);
		CharSequence cs1="Krishna";
		CharSequence cs2=new StringBuffer("Krishna");
		CharSequence cs3=new StringBuilder("Krishna");
		System.out.println();
		System.out.println(cs1);
		System.out.println(cs2);
		System.out.println(cs3);
		System.out.println();
		System.out.println(str);
		//m1(sb3);
		//m1(sb4);
//		static void m1(String s) {
//			System.out.println();
//		}
		/*	public static void m1(StringBuffer sb) {
				System.out.println(sb);
			} 
			public static void m1(CharSequence cs) {
				System.out.println(cs);
			}*/
	}
}	
