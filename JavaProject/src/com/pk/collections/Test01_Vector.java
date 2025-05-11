package com.pk.collections;

import java.util.Vector;

public class Test01_Vector {

	public static void main(String[] args) {
		
		Vector<Object> v1 = new Vector<>();
		
		System.out.println("capacity: "+ v1.capacity());
		System.out.println("size    : "+ v1.size());
		System.out.println("eles    : "+ v1);
		System.out.println();

		v1.add("a");
		v1.add("b");
		v1.add(5);
		v1.add(6.7);
		v1.add('p');
		v1.add(true);
		v1.add(null);
		v1.add(new Ex(5, 6));
		v1.add("a");
		v1.add(5);
		
		System.out.println("eles    : "+ v1);
		System.out.println("size    : "+ v1.size());
		System.out.println("capacity: "+ v1.capacity());
		System.out.println();
		
		v1.add(new Ex(7, 8));
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(6.7);
		
		System.out.println("eles    : "+ v1);
		System.out.println("size    : "+ v1.size());
		System.out.println("capacity: "+ v1.capacity());
		System.out.println();
		
		Object obj = v1.get(4);
		System.out.println(obj);
		System.out.println();
		
		for(int i=0; i<v1.size(); i++) {
			System.out.print(v1.get(i) +"  ");
		}
				
	}
}