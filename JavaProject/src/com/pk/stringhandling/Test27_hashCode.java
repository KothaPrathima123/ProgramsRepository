package com.pk.stringhandling;

public class Test27_hashCode {
	public static void main(String[] args) {
		String s1=new String("a");
		String s2=new String("a");
		String s3=new String("abc");
		System.out.println(s1.hashCode());//97
		System.out.println(s2.hashCode());//97
		System.out.println(s3.hashCode());//96354
		System.out.println(s1.hashCode()==s2.hashCode());//true
		System.out.println(System.identityHashCode(s1));//1554547125
		System.out.println(System.identityHashCode(s2));//617901222
		System.out.println(System.identityHashCode(s3));//1159190947
		String s4="b";
		String s5="b";
		System.out.println(s4.hashCode());//98
		System.out.println(s5.hashCode());//98
		System.out.println(System.identityHashCode(s4));//925858445
		System.out.println(System.identityHashCode(s5));//925858445
		
	}
}
