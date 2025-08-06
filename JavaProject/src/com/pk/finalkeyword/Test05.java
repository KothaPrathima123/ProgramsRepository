package com.pk.finalkeyword;

public class Test05 {
	static void m1(final int p) {
		final int q=20;
		final int r;
		r=30;
		final int s;
		System.out.println(p);//10
		System.out.println(q);//20
		System.out.println(r);//30
		//System.out.println(s); ce: The local variable s may not have been initialized
	}
	public static void main(String[] args) {
		m1(10);
	}
}
