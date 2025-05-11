package com.pk.basics;

class Test04 {
	public static void main(String[] args) {

		//creating an array object for storing 5 integers
		//for this purpose we must use the DT int 
		//            ia1[0] ia1[1] ia1[2] 
		int[] ia1 = {  21   , 31    , 41  };

		System.out.println(ia1.length);	//3

		System.out.println(ia1);		//[classname@hashcode
 /*
		System.out.println(ia1[0]);		//21      //this Sopln() stmts code
		System.out.println(ia1[1]);		//31	  //is static nature code
		System.out.println(ia1[2]);		//41	  //means,30-08-2023 we must modify code
 */								  //by adding or removing number of Sopln() stmts
								  //based on the values we are adding and 
								  //removing in array object

		//System.out.println(ia1[3]);		//no CE, RE: AIOOBE: 3


		for( int i=0 ; i<ia1.length; i++){

			System.out.println(ia1[i]);		//21
		}									//31 	
											//41	
	}	
}