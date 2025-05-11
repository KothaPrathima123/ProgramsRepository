package com.pk.stringhandling;
class A1{
	static String s1="a";
}
class B1{
	static String s2="a";
}
public class Test11_SCPAOnePerJVM {
	public static void main(String[] args) throws InterruptedException {
		String s1="a";
		System.out.println(System.identityHashCode(s1));//1554547125
		s1=null;
		Thread.sleep(500);
		System.gc();
		String s2="a";
		System.out.println(System.identityHashCode(s2));//1554547125
	}
}
