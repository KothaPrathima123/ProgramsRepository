package com.pk.collections;

import java.util.HashSet;

public class Test06_Set_HashSet {
	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<>();
		System.out.println(hs);
		
		System.out.print(hs.add("a")); System.out.println("\t"+hs);
		System.out.print(hs.add("b")); System.out.println("\t"+hs);
		System.out.print(hs.add(5)); System.out.println("\t"+hs);
		System.out.print(hs.add(6.7)); System.out.println("\t"+hs);
		System.out.print(hs.add('p')); System.out.println("\t"+hs);
		System.out.print(hs.add(true)); System.out.println("\t"+hs);
		System.out.print(hs.add(null)); System.out.println("\t"+hs);
		System.out.print(hs.add(new Ex(5,6))); System.out.println("\t"+hs);
		System.out.print(hs.add(new Ex(7,8))); System.out.println("\t"+hs);
		System.out.print(hs.add(new Sa(5,6))); System.out.println("\t"+hs);
		System.out.print(hs.add(new Sa(7,8))); System.out.println("\t"+hs);
		System.out.print(hs.add("a")); System.out.println("\t"+hs);
		System.out.print(hs.add(new String("a"))); System.out.println("\t"+hs);
		System.out.print(hs.add(5)); System.out.println("\t"+hs);
		System.out.print(hs.add(new Integer(5))); System.out.println("\t"+hs);
		System.out.print(hs.add(new Ex(5,6))); System.out.println("\t"+hs);
		System.out.print(hs.add(new Sa(5,6))); System.out.println("\t"+hs);
		System.out.print(hs.add(null)); System.out.println("\t"+hs);
		System.out.print(hs.add(97)); System.out.println("\t"+hs);
		System.out.print(hs.add(98)); System.out.println("\t"+hs);
		System.out.print(hs.add(112)); System.out.println("\t"+hs);		
		
	}
}