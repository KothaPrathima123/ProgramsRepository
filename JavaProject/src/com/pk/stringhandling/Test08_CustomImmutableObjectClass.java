package com.pk.stringhandling;

class StringEx {
	private int x;
	public StringEx(int x) {
		this.x=x;
	}
	public int getX() {
		return this.x;
	}
	public void modify(int x) {
		this.x=this.x+x;
	}
	@Override
	public String toString() {
		return "StringEx [x=" + x + "]";
	}
}
public class Test08_CustomImmutableObjectClass{
	public static void main(String[] args) {
		StringEx s=new StringEx(5);
		System.out.println(s);//StringEx [x=5]
		s.modify(12);
		System.out.println(s);//StringEx [x=17]
		System.out.println();
		Sa sa=new Sa(3);
		sa.modify(4);
		System.out.println(sa);//3
		sa.modify(13);
		System.out.println(sa);//3
		System.out.println();
		Sa sa1=sa.modify(3);
		System.out.println(sa);//3
		System.out.println(sa1);//6
		final Sa sa2=new Sa(5);
		//sa2=new Sa(3);//ce: we cannot modify as it is final ref variable
	}
	
	
}
class Sa{
	private final int x;
	public Sa(int x) {
		this.x=x;
	}
	public Sa modify(int x) {
		return new Sa(this.x+x);
	}
	public String toString() {
		return ""+x;
	}
}
class Xyz{
	private final int x;
	public Xyz(int x) {
		this.x=x;
	}
	public int getX() {
		return x;
	}
}
