package com.pk.staticmembers;

/*
1) What is static?
   - A static is modofier keyword
   - It is an exection level modifier

2) Why static?
   - It is used to set permission to how to access a class memer
   - It is used to provide memory and to access a class member 
     without create an object of its class
	- It provides one copy of memory to class member in this class life time

3) Where can we use static?
    - We must use static keyword in a member declaration statement
	   before a data type and return type

Below program explains providing memory and accessing a class members 
by using static without using object

*/

class Test01_NeedOfSkw{
	static int a = 10;					
	
	static void m1(){
		System.out.println("m1");
	}

	public static void main(String[] args){
		System.out.println( a );
		m1();
	}
}