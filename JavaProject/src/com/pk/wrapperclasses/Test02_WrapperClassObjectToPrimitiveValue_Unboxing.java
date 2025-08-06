package com.pk.wrapperclasses;

public class Test02_WrapperClassObjectToPrimitiveValue_Unboxing {
	public static void main(String[] args) {
		Integer io1=Integer.valueOf(5);
		int i1=io1.intValue();
		byte b1=io1.byteValue();
		short s1=io1.shortValue();
		long l1=io1.longValue();
		float f1=io1.floatValue();
		double d1=io1.doubleValue();
		System.out.println(i1);//5
		System.out.println(b1);//5
		System.out.println(s1);//5
		System.out.println(l1);//5
		System.out.println(d1);//5.0
		Double do1=Double.valueOf(10.5);
		Double do2=do1.doubleValue();
		System.out.println(do2);//10.5
		i1=do1.intValue();
		b1=do2.byteValue();
		s1=do2.shortValue();
		l1=do2.longValue();
		f1=do2.floatValue();
		System.out.println(i1);//10
		System.out.println(b1);//10
		System.out.println(s1);//10
		System.out.println(l1);//10
		System.out.println(f1);//10.5
		//char ch1=io1.charValue();//ce: char ch1=io1.charValue();
		//char ch2=io1.intValue();//ce: Type mismatch: cannot convert from int to char
		char ch3=(char)io1.intValue();
		System.out.println(ch3);//
		//boolean bo1=io1.booleanValue();
		//boolean bo2=io1.intValue(); ce:Type mismatch: cannot convert from int to boolean
		//boolean bo3=(boolean)io1.intValue();//ce: Cannot cast from int to boolean
	}
}
