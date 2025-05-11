package com.pk.wrapperclasses;

public class TestPremitiveValueToWrapperClassObject {
	public static void main(String[] args) {
		Integer io1=new Integer(5);
		Double do1=new Double(10.5);
		Character co1=new Character('c');
		Boolean bo1=new Boolean(true);
		System.out.println(io1);//5
		System.out.println(do1);//10.5
		System.out.println(co1);//c
		System.out.println(bo1);//true
		//Byte b1=new Byte(4); ce: compilersearches for int type param constructor
		//so throws error so,cast arg 5 to arg every wrapper class implicitly contains
		//primitive datatype variable to store primitive value
		Byte b2=new Byte((byte)5);
		Byte b3=5;
		Byte b4=new Byte(b3);
		//Short s1=new Short(4);
		Short s2=new Short((short)3);
		Short s3=5;
		Short s4=new Short(s3);
		Long l1=new Long(5);
		Float f1=new Float(8.0);//no ce: float class has 2 constructors with double and float 
		//Byte b=new Byte();//becoz all wrapper classes do not have 0-param constructor 
		Byte b1=Byte.valueOf((byte)5);
		Short s1=Short.valueOf((short)5);
		Integer in=Integer.valueOf(6);
		Long l=Long.valueOf(4l);
		//Float f=Float.valueOf(12.0);//valueOf double is not available only valueOf float is available
		Float f=Float.valueOf(12.0f);
		Double d=Double.valueOf(12.0d);
		Integer i=new Integer(1);
		Integer i1=new Integer(1);//2 objes are created
		System.out.println(i==i1);//false
		Integer i2=Integer.valueOf(9);
		Integer i3=Integer.valueOf(9);//applies pooling concept up to byte range(-128 to 127)  only one object is created
		System.out.println(i2==i3);//true
		Integer i4=Integer.valueOf(200);
		Integer i5=Integer.valueOf(200);
		System.out.println(i4==i5);//false
		Integer i6=new Integer(10);
		Integer i7=Integer.valueOf(10);
		System.out.println(i6==i7);//false
		//internally pooling is using constructor to create obj so valueOf() is alternative but not replacement 
		//pooling is not applied for float,double 
		Byte by1=Byte.valueOf((byte)4);
		Byte by2=Byte.valueOf((byte)4);
		System.out.println(by1==by2);//true
		Short st1=Short.valueOf((short)6);
		Short st2=Short.valueOf((short)6);
		System.out.println(st1==st2);//true
		Integer it1=Integer.valueOf(5);
		Integer it2=Integer.valueOf((short)5);
		System.out.println(it1==it2);
		Long lt1=Long.valueOf(5);
		Long lt2=Long.valueOf(5);
		System.out.println(lt1==lt2);
		Float ft1=Float.valueOf(5);
		Float ft2=Float.valueOf(5);
		System.out.println(ft1==ft2);//false pooling not applied
		Double dt1=Double.valueOf(5);
		Double dt2=Double.valueOf(5);
		System.out.println(dt1==dt2);//false
		Character ct1=Character.valueOf('a');
		Character ct2=Character.valueOf('a');
		System.out.println(ct1==ct2);//true
		Boolean bt1=Boolean.valueOf(true);
		Boolean bt2=Boolean.valueOf(true);
		System.out.println(bt1==bt2);//true
		System.out.println();
		by1=Byte.valueOf((byte)150);
		by2=Byte.valueOf((byte)150);
		System.out.println(by1==by2);//true
		st1=Short.valueOf((short)150);
		st2=Short.valueOf((short)150);
		System.out.println(st1==st2);//false
		it1=Integer.valueOf(150);
		it2=Integer.valueOf(150);
		System.out.println(it1==it2);//falses
		
		
		
	}
}
