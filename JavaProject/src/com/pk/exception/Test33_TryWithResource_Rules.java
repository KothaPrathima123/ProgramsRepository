package com.pk.exception;
	import java.io.*;
	import java.sql.*;
	class  Test33_TryWithResource_Rules{
		public static void main(String[] args) throws Exception {

	//Rule #1: The resource's variable and object 
		//both must be AutoCloseble type

			//try(	PrintStream ps = new PrintStream(System.out)  ){ 
			//	ps.println("Hello");
			//}

			//try(String s = "a"){ }  //CE: i c t 

			//try(Object obj = new PrintStream(System.out)){ }  //CE: i c t 

			//try(AutoCloseable ac = new PrintStream(System.out)){ } //CE: u r e Exception must handle


	//Rule #2: if the resource object's close() method throws a 
	//checked exception either it is Exception or IOException or SQLException 
	//or some other checked exception, we must handle that 
	//exception either by catching or by reporting using 
	//throws keyword else we will get CE: unreported exception

			//try(PrintStream ps = new PrintStream(System.out)){ }
			//catch block is not required for above try, because
			//PS class close() method does not throw IOException
	                                              
			try(FileOutputStream fos = new FileOutputStream("a.txt") ){ }
			catch(FileNotFoundException e){ }
			catch(IOException e){ }
			
			//here we must place either catch(IOE ) or throws IOE to main method declaration
			//because FOS class close() method throws IOE and constructor throws FNFE
	  

	//Rule #3: the resource variable must be initialized either 
	//with an object or with method call or atleast with null 
	//else we will get CE: = expected 

			//try(PrintStream ps){ 
			//	System.out.println("In try1");		
			//}

			//try(PrintStream ps = null){   
			//	System.out.println("In try2");
			//}

			//try(PrintStream ps = new PrintStream(System.out) ){
			//		System.out.println("In try3");
			//}		

	  //This rule is created because by using the resource variable 
	 //compiler needs to call close() method. If we do not initialize resource variable, 
	  //compiler can not use resource variable to call close() method.
	 //It is the basic rule on accessing a variable "to access variable it must be intialized".



	//Rule #4: Also we can not create object without 
	//variable declaration, else we will get CE: 

			//try(new PrintStream("abc.txt")){
				                            
			//}

	  //for calling close() method on above object,
	  //compiler requires variable


	//Rule #5: We can not assign new object or null
		//to the resource variable inside try body
		//compiler will throw an error, because 
		//original resource object can not be 
		//closed at end of try, because ref var is 
		//pointing to other object or null

			try(	
				PrintStream ps3 = new PrintStream("abc.txt")	
			){
				//	ps3 = new PrintStream("bbc.txt");
				//	ps3 = null;
			}

			//also we can not just declare variable and initialize 
			//it in try block, because of rule #3

			//try(PrintStream ps5){
			//		ps5 = new PrintStream("abc.txt");
			//}



	//Rule #6: By declaring resource variable before of try()
		//we can not use it inside try(), we will  CE: 
		//the try-with-resources resource must be a 
		//variable declaration

			PrintStream ps4; 
			//try(	ps4 = new PrintStream("abc.txt")	){ 
			
			//}

			try(	
				PrintStream ps5 = new PrintStream("abc.txt")
			){ 
			
			}


	//Rule #7:	We can not use the variable created before try{} 
				//as try-resource, compiler will throw error
			PrintStream ps5 = new PrintStream("abc.txt");	 
			try( ps5 ){ }  //upto Java 8v it is not allowed

	  //Note:if we want to use before try{} created objects
	  //as try resource, we must create a local variable 
	  //in try() and assign that outer object to this LV
			FileOutputStream fos6 = new FileOutputStream("abc.txt");	 
			try(FileOutputStream fos7 = fos6){   //Upto Java 8v style
				
			}

	//Java 9 enchancement in try-with-resource
		//From Java 9v, we no need to create local variable 
		//to use the object as try() resource that is create before of try(){ }
		//we can directly access them by using the same ref var
			FileOutputStream fos8 = new FileOutputStream("abc.txt");	 
			try(fos8){
				fos8.write('a');
			}
			

	//Rule #8: We can not use try-resource LV 
		//after try block, we will get CE: c f s
		//also when we use extenal referenced variable as try resource, 
		//we can not use it after try{ },  here no CE, 
		//but we will get RE: IOExcetion: stream closed
			//fos7.write('a');			//CE: c f s 	
			//fos6.write('b');			//RE: IOE
			//fos8.write('b');			//RE: IOE	


	//Rule #9: Inside try(), if we want to create or use multiple resources 
		//we must separate them by using ;  but not by using ,
			try(
				FileOutputStream fos = new FileOutputStream("abc.txt")  	 
			){}
			
			try(
				FileOutputStream fos = new FileOutputStream("abc.txt")  ; 
			){}

			try(
				FileOutputStream fos9 = new FileOutputStream("abc.txt")  ;	 
				FileOutputStream fos10 = new FileOutputStream("abc.txt")	 
			){ }

			FileOutputStream fos11 = new FileOutputStream("abc.txt");	 
			FileOutputStream fos12 = new FileOutputStream("abc.txt");	 
			try(fos11){ }				try(fos11;){}
			try(fos11; fos12){ }		//try(fos11, fos12){}  

	//Rule #10: In try(), we can not place logic, compiler will throw error. 
	 //Logic is allowed only inside try{  } body.

	 //In try() only AutoCloseble type variable declaration  with initalization is allowed. 
	 //We can initialize resource variable either with new keyword and constructor or
	 //with method call or with null. 

			try(
				PrintStream pw14 = new PrintStream(System.out);
				//pw14.println("Hi");

				FileInputStream fis = new FileInputStream("abc.txt");
				//int a = fis.read();

				Connection con = DriverManager.getConnection(null, null, null);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("");
				//rs.next();
				//boolean bo = rs.next();
			){
				pw14.println("Hi");
				int a = fis.read();
				rs.next();
			}
		/**/
		} 
}
