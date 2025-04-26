package com.pk.collections;

import java.util.TreeSet;

public class  TSwithAObjects{
	public static void main(String[] args) {
		TreeSet<A01> ts = new TreeSet<A01>();
		ts.add( new A01(1) );
		ts.add( new A01(3) );
		ts.add( new A01(1) );
		ts.add( new A01(2) );

		A01 a5 = new A01(4);
		ts.add(a5);
		ts.add(a5);

		System.out.println("ts elements: "+ts);
	}
}

//A.java
class A01 implements Comparable {
	private int x;
	A01(int x){
		this.x = x;
	}
	public String toString(){
		return "A01("+x+")";
	}
	public int compareTo(Object obj) {
		//insert code here
		//case1:
		//return 0;//[A(1)]
		//case2:
		//return 5;//[A(1), A(3), A(1), A(2), A(4), A(4)]
		//case3:
		return -5;//[A(4), A(4), A(2), A(1), A(3), A(1)]
		//case4:
		//return this.x - (obj)a.x;//As per project we must not return 0, +ve or -ve number directly
		//we must generate them by substracting one object state from another object state, then only we can store elements in Asc or Desc order by avoiding duplicates.

	}
	
}
