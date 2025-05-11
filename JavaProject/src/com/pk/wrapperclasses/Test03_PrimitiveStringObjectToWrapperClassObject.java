package com.pk.wrapperclasses;

public class Test03_PrimitiveStringObjectToWrapperClassObject {
	public static void main(String[] args) {
		Integer io1=new Integer("5");//the constructor Integer(String) has been deprecated since version 9 and marked for removal
		Integer io2=Integer.valueOf("5");
		Integer io3=Integer.valueOf("19"); 
		Integer io4=Integer.valueOf("19");
		System.out.println(io3==io4);//true
		Integer io5=Integer.valueOf("190");
		Integer io6=Integer.valueOf("190");
		System.out.println(io5==io6);//false
		Integer io7=new Integer("7");
		Integer io8=new Integer("7"); 
		System.out.println(io7==io8);//false
		Double do1=new Double("10.5");
		Double do2=Double.valueOf("10.5");
		System.out.println(do1+" "+do2);//10.5 10.5
		//Character ch1=new Character("a");//ce: The constructor Character(String) is undefined
		Boolean bo1=new Boolean("true");
		Boolean bo2=Boolean.valueOf("true");
		System.out.println(bo1+" "+bo2);//true true
		
	}
}
