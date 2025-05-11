package com.pk.stringhandling;

public class Test21_insert {
	public static void main(String[] args) {
		StringBuffer sb2=new StringBuffer("acef");
		System.out.println("sb chars: "+sb2);
		sb2.insert(1, "b");
		System.out.println("sb chars: "+sb2);
		sb2.insert(3, 'd');
		System.out.println("sb chars: "+sb2);
		sb2.insert(sb2.length()-1, "g");
		System.out.println("sb2 chars: "+sb2);
		sb2.insert(sb2.length(), "h");
		System.out.println("sb2 chars: "+sb2);
		//sb2.insert(sb2.length()+1, "i");//ArrayIndexOutOfBoundsException
		//sb2.insert(5, null);//ce: The method insert(int, Object) is ambiguous for the type StringBuffer
		sb2.insert(5, (String)null);
		//sb2.insert(5, (char[])null);//NullPointerExce
		//sb2.insert(35, "b");//SIOOB
		//sb2.insert(-5, "b");
		sb2.insert(0,"b");
		System.out.println("sb2 chars: "+sb2);
		StringBuffer sb3=new StringBuffer(2);
		sb3.append("ab");
		sb3.insert(1, 'c');
		
	}
}
