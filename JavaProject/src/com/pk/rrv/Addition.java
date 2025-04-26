package com.pk.rrv;

class Addition {
    public static void main(String[] args) {
         int a = 10;
	  int b = 20;
	  int c = a + b;
	  System.out.println("Result: "+ c);
    }
}/*
//Addition.java
//Command line arguments application
class Addition {
   public static void main(String[] args) {
			
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a + b;
		System.out.println("Result: "+ c);
			

   }
}

/*
D:\01CJ\RRV>javac Addition.java

D:\01CJ\RRV>java Addition  10  20 <-|
							Addition.main(new String[]{"10", "20"});

*/
class ReadingAllValues {
	public static void main(String[] args) 	{

		if(args.length==0){
			System.out.println("You did not pass values");
			return;
		}
		
		for(int i=0; i<args.length; i++){
		//for(int i=0; i<=args.length; i++){
		//for(int i=0; i<=args.length-1; i++){
		//for(int i=0; i<args.length-1; i++){
			System.out.println("args["+i+"]: "+ args[i]);
		}


	}
}
