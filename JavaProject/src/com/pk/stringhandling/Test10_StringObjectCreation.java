package com.pk.stringhandling;

import java.util.Scanner;

public class Test10_StringObjectCreation {
	public static void main(String[] args) {
		String s1="a";
		String s2="a";
		String s3="A";
		System.out.println(System.identityHashCode(s1));//1554547125
		System.out.println(System.identityHashCode(s2));//1554547125
		System.out.println(System.identityHashCode(s3));//617901222
		System.out.println();
		String s4=new String("a");
		String s5=new String("b");
		String s6=new String("b");
		String s7=new String(s6);
		System.out.println(System.identityHashCode(s4));//1159190947
		System.out.println(System.identityHashCode(s5));//925858445
		System.out.println(System.identityHashCode(s6));//798154996
		System.out.println(System.identityHashCode(s7));//681842940
		System.out.println();
		String s8=s1.concat(s2);
		String s9=s1.concat(s2);
		System.out.println(System.identityHashCode(s8));//1392838282
		System.out.println(System.identityHashCode(s9));//523429237
		System.out.println();
		String s10=s1+s2;
		String s11=s1+s2;
		System.out.println(System.identityHashCode(s10));//468121027
		System.out.println(System.identityHashCode(s11));//1804094807
		System.out.println();
		String s12="b";
		String s13="ab";
		String s14="a"+"b";
		String s15=s1+s2;
		System.out.println(System.identityHashCode(s12));
		System.out.println(System.identityHashCode(s13));
		System.out.println(s14);//951007336
		System.out.println(s15);//2001049719
		System.out.println();
		String s19="a".concat("b");
		String s20="a".concat("b");
		System.out.println(System.identityHashCode(s19));//ab
		System.out.println(System.identityHashCode(s20));//aa
		System.out.println();
		Scanner sc=new Scanner(System.in);
		String s17=sc.nextLine();
		String s18=sc.nextLine();
		System.out.println(System.identityHashCode(s17));//1528902577
		System.out.println(System.identityHashCode(s18));//1927950199
	}
}
