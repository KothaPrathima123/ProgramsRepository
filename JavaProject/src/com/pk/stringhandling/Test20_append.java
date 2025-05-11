package com.pk.stringhandling;

public class Test20_append {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println("sb capacity: "+sb.capacity());//16
		System.out.println(sb.length());//0
		System.out.println(sb);
		sb.append("a10");
		System.out.println("sb capacity: "+sb.capacity());//16
		System.out.println(sb.length());//3
		System.out.println(sb);//a10
		Pqr p1=new Pqr();
		sb.append(p1);
		System.out.println("sb capacity: "+sb.capacity());//37
		System.out.println(sb.length());//37
		System.out.println(sb);//a10com.pk.stringhandling.Pqr@5b2133b1
		//sb.append(null);ce: The method append(Object) is ambiguous for the type StringBuffer
		sb.append((String)null);
		System.out.println();
		//sb.append((char[])null);//RE: NullPointerException
		StringBuffer sb1=new StringBuffer();
		for(int i=1;i<=20;i++) {
			sb1.append(i);
		}
		System.out.println(sb1.capacity());//34
		System.out.println(sb.length());//41
		System.out.println(sb1);//1234567891011121314151617181920
		
		
		
		
	}
}
