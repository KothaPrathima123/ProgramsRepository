package com.pk.finalkeyword;

class B1{
	final int m=10;
	final int n;
	final int o;
	{
		//m=15;//ce: reinitialization
		n=20;
	}
	{
		//n=30;//ce: reinitialization
	}
	B1(){
		o=40;
	}
	B1(int x){
		o=30;
	}
}
class C{
	final int p;
	C(){
		this(5);
	}
	C(int x){
		p=10;//Ce: field p might not been initialized
	}
	/*C(String s){
		//CE: field p might not been initialized
	}*/
}
public class D{
	final int p;
	final int q;
	D(){
		this(5);
		//p=10;
	}
	D(int x){
		q=20;//ce: The blank final field p may not have been initialized
		p=12;
	}
	D(String x){
		p=30;
		q=23;
	}
	public static void main(String[] args) {
		B1 b=new B1();
		System.out.println(b.m+" "+b.n+" "+b.o);//10 20 30
		C c=new C();
		System.out.println(c.p);//10
		D d=new D();
		System.out.println(d.p+" "+d.q);//12 20
		D d1=new D(4);
		System.out.println(d.p+" "+d.q);//12 20
	}
	
}
