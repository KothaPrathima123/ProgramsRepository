package com.pk.stringhandling;

public class Test18_SBConstructors {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		System.out.println("sb1 capacity: "+sb1.capacity());
		System.out.println("sb1 size: "+sb1.length());
		System.out.println("sb1 chars: "+sb1);
		StringBuffer sb2=new StringBuffer(50);
		System.out.println("sb2 capacity: "+sb2.capacity());
		System.out.println("sb2 size: "+sb2.length());
		System.out.println("sb2 chars: "+sb2);
		System.out.println();
		StringBuffer sb3=new StringBuffer("abc");
		System.out.println("sb3 capacity: "+sb3.capacity());
		System.out.println("sb3 size: "+sb3.length());
		System.out.println("sb3 chars: "+sb3);
		sb3.append("d");
		System.out.println("sb3 capacity: "+sb3.capacity());
		System.out.println("sb3 size: "+sb3.length());
		System.out.println("sb3 chars: "+sb3);
		StringBuffer sb4=new StringBuffer(sb3);
		System.out.println("sb4 capacity: "+sb4.capacity());
		System.out.println("sb4 size: "+sb4.length());
		System.out.println("sb4 chars: "+sb4);
		//StringBuffer sb5=new StringBuffer(-5);//Re: NegativeArraySizeException
		StringBuffer sb6=new StringBuffer(0);
		//StringBuffer sb7=new StringBuffer(null);//RE: NullPOinterExceptio We cannot create String obj with null
		//String s1=new String(null);
		//String s1=new String((String)null);re: "main" java.lang.NullPointerException: Cannot read field "value" because "original" is null
		StringBuffer sb7=null;
		System.out.println("sb7: "+sb7);//null
		//StringBuffer sb8="null";//ce: Type mismatch: cannot convert from String to StringBuffer
		StringBuffer sb10=new StringBuffer("null"); 
		System.out.println("sb10 capacity: "+sb10.capacity());
		System.out.println("sb10 size: "+sb10.length());
		System.out.println("sb10 chars: "+sb10);
		
	}
}
