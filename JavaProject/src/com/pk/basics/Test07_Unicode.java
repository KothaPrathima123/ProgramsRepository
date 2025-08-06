package com.pk.basics;
class Test07_Unicode{
	public static void main(String[] args) {
/*
		System.out.println(\u0030);	
		System.out.println(\u0031);	
		System.out.println(\u0032);
		System.out.println(\u0033);
		System.out.println(\u0034);
		System.out.println(\u0035);
		System.out.println(\u0036);
		System.out.println(\u0037);
		System.out.println(\u0038);
		System.out.println(\u0039);	
		System.out.println();

//		System.out.println(\u0040);	
		System.out.println('\u0040');	
		System.out.println("\u0040");	

//		System.out.println(\u0041);	 
//		System.out.println(\u0061);	  
		
		System.out.println('\u0041');
 		System.out.println('\u0061');	  
		System.out.println();

		System.out.println("\u0041");
 		System.out.println("\u0061");	  
		System.out.println();

		System.out.println("\u0049");
//		System.out.println("\u0050");

		System.out.println("\u004A");
		System.out.println("\u004B");
		System.out.println("\u004C");
		System.out.println("\u004D");
		System.out.println("\u004E");
		System.out.println("\u004F");

		System.out.println("\u0050");

		System.out.println("\u0058");
		System.out.println("\u0059");
		System.out.println("\u005A");

		System.out.println("\u0060");

		System.out.println("\u0061");
		System.out.println();

		System.out.println(\u0035);  
		System.out.println(\u0037);  
		System.out.println();

		System.out.println('\u0035');  
		System.out.println('\u0037');  
		System.out.println();

		System.out.println("\u0035");  
		System.out.println("\u0037");  
		System.out.println();

		System.out.println(\u0030);	//->  Sopln(0);	
//		System.out.println(\u0041);	//->	Sopln(A);  
// 		System.out.println(\u0061);	//->	Sopln(a);  
 		System.out.println();  

		System.out.println(\u0031\u0032\u0033);
//		System.out.println(\u0041\u0042);
//		System.out.println('\u0041\u0042');
		System.out.println("\u0041\u0042");
		System.out.println(
			  "\u0041\u0042 \u0030\u0039 \u0045\u0046 \u0035\u0037\u0036\u0030"
		);

		System.out.println(\u00312\u0033);
		System.out.println("H\u0041RI");
		System.out.println();


		int a = 5;
		System.out.println(a);
		System.out.println(\u0061);
		System.out.println('\u0061');
		System.out.println();

		\u0061 = 7;
		System.out.println(a);
		System.out.println(\u0061);
		System.out.println();

		int \u0062 = 8;
		System.out.println(\u0062);
		System.out.println();

		\u0064ou\u0062le \u00641 = \u0039;
		System.out.println(d1);

		\u0064ou\u0062le \u00642 = \u0039.0;
		System.out.println(d2);
		System.out.println();

//		\u0066lo\u0061t \u0066 = \u0039.0; 
		\u0066lo\u0061t \u0066 = \u0039.0F;
		System.out.println(\u0066);
		System.out.println();

		\u0066lo\u0061t \u0066\u0031 = \u0039.\u0030\u0066;
		System.out.println(\u00661);
		System.out.println();

		\u0064ou\u0062le \u0065 = '1';
		System.out.println(e);

		\u0064ou\u0062le \u00652 = '\u0032';
		System.out.println(e2);
		System.out.println();

		ch\u0061r ch01 = '\u0031';
		System.out.println(ch01);

		char ch02 = \u0031;
		System.out.println(ch02);

		char ch03 = \u0039\u0037;
		System.out.println(ch03);
		System.out.println();
*/

//		char ch03 = '\u0039\u0037';
//		System.out.println(ch04);

		String s1 = "\u0041\u0042";	System.out.println(s1);
		String s2 = "\u0031\u0032";	System.out.println(s2);

//		String s4 = \u0031\u0032;
//		String s5 = \u0041\u0042;

//		int i1 = \u0041;		
		int i2 = '\u0041';						System.out.println(i2);

System.out.println();
		int i3 = \u0031\u0032;				System.out.println(i3);
		int i4 = \u0030\u0031;				System.out.println(i4);
//		int i5 = \u0030\u0038;				System.out.println(i5);
		int i6 = \u0030\u0031\u0032;		System.out.println(i6);
		int i7 = 0x\u0031\u0032;			System.out.println(i7);
		int i8 = 0x\u0041\u0031;			System.out.println(i8);
//		int i9 = 0b\u0031\u0032;			System.out.println(i9);
		int i10 = 0b\u0031\u0030;			System.out.println(i10);
		int i11 = \u0030b\u0031\u0030;		System.out.println(i11);
		int i12 = \u0030\u0062\u0031\u0030;		System.out.println(i11);
System.out.println();

		System.out.println(\u0031L);
		System.out.println(\u0031F);
		System.out.println(\u0031D);
		System.out.println(\u0031\u0044);
		System.out.println(\u0031.0);
		System.out.println(\u0031.\u0030);
		System.out.println(\u0031\u002E\u0030);

//		System.out.println(\u0041L);
//		System.out.println(\u0041F);
//		System.out.println(\u0041D);
//		System.out.println(\u0041.0);
//		System.out.println('\u0041'.0);
	

System.out.println();	
//		System.out.println('\u0041'L);
//		System.out.println('\u0041'F);
//		System.out.println('\u0041'D);
//		System.out.println('\u0041'.0);
//		System.out.println();	

//		System.out.println('A'L);
//		System.out.println('A'.0);

		System.out.println();	
		System.out.println("\u0041L");
		System.out.println("\u0041F");
		System.out.println("\u0041D");
		System.out.println("\u0041.0");

		System.out.println();
		System.out.println('\u0049');  
		System.out.println('\u0050');  
		System.out.println();

		System.out.println('\u004A');  
		System.out.println('\u004B');  
		System.out.println('\u004C');  
		System.out.println('\u004D');  
		System.out.println('\u004E');  
		System.out.println('\u004F'); 
		System.out.println('\u0050');  
		System.out.println();

		System.out.println('\u0058');  
		System.out.println('\u0059');  
		System.out.println('\u005A');  
		System.out.println();
		System.out.println('\u005B');  
		//System.out.println(\u005C);  
		System.out.println('\u005D');  
		System.out.println('\u005E');  
		System.out.println('\u005F');  
		System.out.println('\u0060');  
/**/
	}
}