package com.pk.stringhandling;

public class Test15_replace {
	public static void main(String[] args) {
		String s1="abc abc abc";
		System.out.println(s1);
		s1.replace("a", "b");
		System.out.println(s1);
		System.out.println();
		String s2=s1.replace('a', 'b');
		System.out.println(s1);
		System.out.println(s2);
		String s3=s1.replace('a', 'd');
		System.out.println(s1);
		String s4=s1.replace('a', 'e');
		System.out.println(s1);
		System.out.println(s4);
		System.out.println(s1==s4);
		System.out.println();
		String s5=s1.replace('D', 'e');
		System.out.println(s1);
		System.out.println(s5);
		System.out.println(s1==s5);
		String s8=s5.replaceFirst(".","#");
		System.out.println(s8);
		//String s10=s5.replaceAll("\\", "#");
		//System.out.println(s10);
		String s11=s5.replaceFirst("\'","#");
		String s12="abc$bbc?cbc";
		String s13=s12.replaceAll("$", "_");
		System.out.println(s12);
		System.out.println(s13);
		//String s14=s12.replaceAll("?", "@");//re:Dangling meta character '?' near index 0 
		String s15=s12.replaceAll("\\?", "@");
		String s16=s15.replace('a', 'b');
		String s17=s15.replace("a", "b");
		String s18=s17.replace('a', 'b');
		System.out.println(s16==s17);
		System.out.println(s17==s18);
		System.out.println(s16.equals(s17));
	}
}
