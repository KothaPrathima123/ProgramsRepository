package com.pk.nsb;

public class Example05 {

						                   
		int   x   = 10;					 	
		{								
			System.out.println("NSB");			 	
		}								
									             
		int    y   = 20;					 	     
										     
		Example05() {					 	     
			System.out.println("NPC");					     
		}								
										
		Example05(int i) {				 	
			System.out.println("IPC");					    
		}								
}                              
										    
										    
class Example_05 extends java.lang.Object{  
int x;
int y;
Example_05(final Example_05 this) {
	super();
	this.x=10;
	{System.out.println("NSB");}
	this.y=20;
	System.out.println("NPC");
}
Example_05(final Example_05 this,int i){
	super();
	this.x=10;
	{System.out.println("NSB");}
	this.y=20;
	System.out.println("IPC");
}
}