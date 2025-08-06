package com.pk.toString;

public class  Example10 {
	int x ;
	int y ;

	Example10(int p, int q){
		x = p;
		y = q;
	}
	
	@Override
	public String toString() {
		return x + "  " + y;
	}


	public static void main(String[] args) throws Exception	{

		Example10 e1 = new Example10(5, 6);
		System.out.println(e1); //e1.toString() -> Example -> Object ->  CN@hc
								
		String s1 = new String("AAA");
		System.out.println(s1);	//s1.toString() -> String -> data

		Integer io = new Integer(10);
		System.out.println(io);	//io.toString() -> Integer -> data

		java.io.File file = new java.io.File("abc.txt");
		System.out.println(file);//file.toString() -> File -> data

		java.io.FileWriter fw = new java.io.FileWriter("abc.txt");
		System.out.println(fw); //fw.toString() -> FileWriter -> Object ->  CN@hc    /*
/**/
	}
}
