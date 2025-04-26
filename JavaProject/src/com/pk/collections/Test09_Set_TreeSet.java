package com.pk.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Test09_Set_TreeSet {
	public static void main(String[] args) {
		
		TreeSet<Object> ts1 = new TreeSet<>();
		ts1.add("a");
		ts1.add("c");
		ts1.add("b");
		ts1.add("d");
		ts1.add("f");
		ts1.add("e");
		System.out.println(ts1);
		//ts1.add(5);
		//ts1.add(null);
		
		TreeSet<Integer> ts2 = new TreeSet<>();
		ts2.add(5);
		ts2.add(7);
		ts2.add(6);
		System.out.println(ts2);
		
		TreeSet<Sa01> ts3 = new TreeSet<>();
		ts3.add(new Sa01(5, 9));  //s1.compareTo(s1) -> ignores -> added as root	
		ts3.add(new Sa01(7, 3));	//s2.compareTo(s1) -> +ve -> added right to s1
		ts3.add(new Sa01(6, 4));	//s3.compareTo(s1) -> +ve -> added right to s1
								//s3.compareTo(s2) -> -ve -> added left to s2
		
		System.out.println(ts3);

		TreeSet<Sa01> ts4 = new TreeSet<>(
								new Comparator<Sa01>() {
									@Override
									public int compare(Sa01 s1, Sa01 s2) { //s1=nao s2=aao
										return s1.getY() - s2.getY();
									}
								}
							);
		
		ts4.add(new Sa01(5, 9));  //cc.compare(s1,s1) -> ignores -> added as root	
		ts4.add(new Sa01(7, 3));	//cc.compare(s2,s1) -> ve -> added left to s1
		ts4.add(new Sa01(6, 4));	//cc.compare(s3, s1) -> -ve -> added left to s1
								//cc.compare(s3,s2) -> +ve -> added right to s2

		TreeSet<Sa01> ts5 = new TreeSet<>(
							(nao, aao) -> aao.getX() - nao.getX());
		
		ts5.add(new Sa01(5, 9));  //cc.compare(s1,s1) -> ignores -> added as root	
		ts5.add(new Sa01(7, 3));	//cc.compare(s2,s1) -> ve -> added left to s1
		ts5.add(new Sa01(6, 4));	//cc.compare(s3, s1) -> -ve -> added left to s1
								//cc.compare(s3,s2) -> +ve -> added right to s2
		
		System.out.println(ts5);

		TreeSet<Sa01> ts6 = new TreeSet<>(
				(nao, aao) -> aao.getY() - nao.getY());
		
		ts6.add(new Sa01(5, 9));  //cc.compare(s1,s1) -> ignores -> added as root	
		ts6.add(new Sa01(7, 3));	//cc.compare(s2,s1) -> ve -> added left to s1
		ts6.add(new Sa01(6, 4));	//cc.compare(s3, s1) -> -ve -> added left to s1
								//cc.compare(s3,s2) -> +ve -> added right to s2
		
		System.out.println(ts6);
	}
}