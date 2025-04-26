package com.pk.basics;
class  Test08_UnderscoreTC8{
	public static void main(String[] args) {

		double amt1 =  100000;			System.out.println(amt1);
//		double amt2 =  1,00,000;   
		double amt3 =  1_00_000;
		System.out.println(amt3);
		System.out.println();

//Rule #1:                                          
		double amt4 = 1_00_000;			System.out.println(amt4);
//		double amt5 = _100000;				System.out.println(amt5);
//		double amt6 = 100000_;				System.out.println(amt6);
		double amt7 = 100_____000;		System.out.println(amt7);
		System.out.println();

//Rule #2:                                     
		double d0 = 100000.65;				System.out.println(d0);
		double d1 = 1_00_000.6_5;			System.out.println(d1);
//		double d2 = 100000_.65;
//		double d3 = 100000._65;
		System.out.println();

//Rule #3:		
		long l1 = 1_00_000L;				System.out.println(l1);
//		long l2 = 100000_L;
//		long l3 = 100000L_;

		float f1 = 1_00_000F;
//		float f2 = 100000_F;
//		float f3 = 100000F_;

		double dd1 = 1_00_000D;
//		double dd2 = 100000_D;
//		double dd3 = 100000D_;

//Rule #4: 
//		int i3 = _0x1234;
//		int i4 = 0_x1234;
//		int i5 = 0x_1234;
		int i6 = 0x1_234;
		int i7 = 0xA_B23;

//		int i8 = 0B_1010;
		int i9 = 0B10_10;

		int i10 = 0_123;
		System.out.println(i10);

//		int i11 = _0123;

//Rule #5:
		int i12 = \u0031;
	
		int i19 = \u0031_\u0032;

	}
}