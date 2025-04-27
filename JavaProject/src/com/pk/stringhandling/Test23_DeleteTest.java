package com.pk.stringhandling;

public class Test23_DeleteTest {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Jai Sri Krishna");
		System.out.println("SB chars: "+sb1);
		sb1.delete(5, 13);
		System.out.println("Sb chars: "+sb1);
		sb1.deleteCharAt(4);
		System.out.println("Sb chars: "+sb1);
		StringBuffer sb2=new StringBuffer("abcdef");
		sb2.deleteCharAt(1);
		sb2.deleteCharAt(2);
		//sb2.deleteCharAt(20);
	}
}
