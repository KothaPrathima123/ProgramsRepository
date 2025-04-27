package com.pk.stringhandling;

public class Test22_SetCharAt {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abc bbc cbc");
		System.out.println("Sb chars: "+sb);
		sb.setCharAt(3, '_');
		sb.setCharAt(5, 'B');
		System.out.println("SB chars: "+sb);
		sb.setCharAt(sb.length()-1, 'z');
		sb.replace(2,5,"xyz");
		sb.replace(2,7,"PQR");
		sb.replace(2, 4, "MNOP");
		System.out.println("SB chars: "+sb);
		sb.replace(2, 4, "MNOP");
		System.out.println("SB chars: "+sb);
		
	}
}
