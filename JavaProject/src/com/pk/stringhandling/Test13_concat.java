package com.pk.stringhandling;

public class Test13_concat{
	public static void main(String[] args) {
		String s1="sri";
		String s2=s1.concat("ram");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println();
		String s3="a";
		s3.concat("b");
		System.out.println("s3: "+s3);
		System.out.println();
		String s4=s3.concat("c");
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
		System.out.println(s3==s4);
		System.out.println();
		s3=s3.concat("d");
		System.out.println(s3);
		System.out.println();
		System.out.println(s3.concat("f"));
		System.out.println(s3);
		System.out.println();
		String s5=s3.concat("'");
		System.out.println("s3: "+s3);
		System.out.println("s5: "+s5);
		System.out.println(s3==s5);
		String s6="";
		String s7=s6.concat(s3);
		System.out.println("s6: "+s6);
		System.out.println("s7: "+s7);
		System.out.println(s6==s7);
		System.out.println(s3==s7);
		System.out.println();
		String s8="p";
		String s9=s8+"q";
		String s10=s8+" ";
		String s11=""+s8;
		System.out.println("s8: "+s8);
		System.out.println("s9: "+s9);
		System.out.println("s10: "+s10);
		System.out.println("s11: "+s11);
		System.out.println(s8==s9);
		System.out.println(s8==s10);
		System.out.println(s10==s11);
		String s15="abc";
		String s16="a"+"b"+"c";
		String s17="a".concat("b").concat("c");
		System.out.println(s15==s16);
		System.out.println(s15==s17);
		System.out.println();
		String s18="a";
		String s19=s18.concat("b");
		String s20=s18.concat("b");
		System.out.println(s19==s20);
		System.out.println();
		String s21=s18.concat("");
		String s22=s18.concat("");
		System.out.println(s18==s21);
		System.out.println(s18==s22);
		System.out.println(s21==s22);
		System.out.println();
		String s23=null;
		String s24=null;
		String s25=s23+s24;
		System.out.println(s25);
		String s27=7+6+"ravi"+3+5+null;
		System.out.println(s27);
		String s28="a";
		String s29="a";
		System.out.println("s28==s29"+s28==s29);
		System.out.println("s28==s29"+(s28==s29));
		String s30="abc";
		String s31="bbc";
		String s32=s30+s31;
		String s33=new StringBuilder().append(s30).append(s31).toString();
		String s34=s30.concat(s32);
		System.out.println(s33);
		System.out.println(s34);
		String s35=s31+s32+s31+s32;
		String s36=s31.concat(s32).concat(s31).concat(s32);
		String s37="a"+7;
		//String s38="a".concat(9);//ce: The method concat(String) in the type String is not applicable for the arguments (int)
		
		
	}
}