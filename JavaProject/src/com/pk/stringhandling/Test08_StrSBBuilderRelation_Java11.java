package com.pk.stringhandling;

import java.util.Comparator;
import java.util.TreeSet;

public class Test08_StrSBBuilderRelation_Java11 {
	public static void main(String[] args) {
		TreeSet<String> ts1=new TreeSet<>();
		ts1.add("a");
		ts1.add("c");
		ts1.add("b");
		
		System.out.println(ts1);//[a, b, c]
		TreeSet<String> ts2=new TreeSet<>();
		ts2.add(new StringBuilder("a").toString());
		ts2.add(new StringBuilder("b").toString());
		ts2.add(new StringBuilder("c").toString());
		System.out.println(ts2);//[a, b, c]
		
		TreeSet<StringBuilder> ts3=new TreeSet(new SBComparator());
		ts3.add(new StringBuilder("a"));
		ts3.add(new StringBuilder("b"));
		ts3.add(new StringBuilder("c"));
		System.out.println(ts3);//[a, b, c]
		
		TreeSet<StringBuilder> ts4=new TreeSet<>(new Comparator<StringBuilder>() {

			@Override
			public int compare(StringBuilder sb1, StringBuilder sb2) {
				return sb1.toString().compareTo(sb2.toString());
			}
		});
		ts3.add(new StringBuilder("p"));
		ts3.add(new StringBuilder("q"));
		ts3.add(new StringBuilder("r"));
		System.out.println(ts4);//[]
	TreeSet<StringBuilder> ts5=new TreeSet<StringBuilder>((sb1,sb2)->sb1.toString().compareTo(sb2.toString()));
	ts5.add(new StringBuilder("p"));
	ts5.add(new StringBuilder("q"));
	ts5.add(new StringBuilder("r"));
	System.out.println(ts5);//[p,q,r]
	TreeSet<StringBuilder> ts6=new TreeSet<>(A::m1);
	ts6.add(new StringBuilder("p"));
	ts6.add(new StringBuilder("q"));
	ts6.add(new StringBuilder("r"));
	System.out.println(ts6);//[p,q,r]
	TreeSet<StringBuilder> ts7=new TreeSet<>();
	ts7.add(new StringBuilder("m"));
	ts7.add(new StringBuilder("n"));
	ts7.add(new StringBuilder("o"));
	System.out.println(ts7);//[m,n,o]
	/*TreeSet<StringBuffer> ts8=new TreeSet<>();
	ts8.add(new StringBuffer("a"));
	ts8.add(new StringBuffer("b"));
	System.out.println(ts8);*/
	
}
}
class SBComparator implements Comparator<StringBuilder>{

	@Override
	public int compare(StringBuilder sb1, StringBuilder sb2) {
		String s1=sb1.toString();
		String s2=sb2.toString();
		return s1.compareTo(s2);
	}
	
}
class A {
	static int m1(StringBuilder sb1,StringBuilder sb2) {
		return sb1.toString().compareTo(sb2.toString());
	}
}



