package com.pk.collections;

import java.util.LinkedHashSet;

public class Test07_Set_LinkedHashSet {
	public static void main(String[] args) {
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		System.out.println(lhs);
		
		System.out.print(lhs.add("a")); System.out.println("\t"+lhs);
		System.out.print(lhs.add("b")); System.out.println("\t"+lhs);
		System.out.print(lhs.add(5)); System.out.println("\t"+lhs);
		System.out.print(lhs.add(6.7)); System.out.println("\t"+lhs);
		System.out.print(lhs.add('p')); System.out.println("\t"+lhs);
		System.out.print(lhs.add(true)); System.out.println("\t"+lhs);
		System.out.print(lhs.add(null)); System.out.println("\t"+lhs);
		System.out.print(lhs.add(new Ex(5,6))); System.out.println("\t"+lhs);
		System.out.print(lhs.add(new Ex(7,8))); System.out.println("\t"+lhs);
		System.out.print(lhs.add(new Sa(5,6))); System.out.println("\t"+lhs);
		System.out.print(lhs.add(new Sa(7,8))); System.out.println("\t"+lhs);
		System.out.print(lhs.add("a")); System.out.println("\t"+lhs);
		System.out.print(lhs.add(new String("a"))); System.out.println("\t"+lhs);
		System.out.print(lhs.add(5)); System.out.println("\t"+lhs);
		System.out.print(lhs.add(new Integer(5))); System.out.println("\t"+lhs);
		System.out.print(lhs.add(new Ex(5,6))); System.out.println("\t"+lhs);
		System.out.print(lhs.add(new Sa(5,6))); System.out.println("\t"+lhs);
		System.out.print(lhs.add(null)); System.out.println("\t"+lhs);
		System.out.print(lhs.add(97)); System.out.println("\t"+lhs);
		System.out.print(lhs.add(98)); System.out.println("\t"+lhs);
		System.out.print(lhs.add(112)); System.out.println("\t"+lhs);
		
		
		
	}
}