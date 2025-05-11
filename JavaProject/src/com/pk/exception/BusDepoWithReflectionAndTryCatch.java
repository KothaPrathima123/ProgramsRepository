package com.pk.exception;

import java.sql.Driver;
import java.util.Scanner;
public class BusDepoWithReflectionAndTryCatch {

	public static void main(String[] args) {
		String vehicleName = null;
		try	{
		
			//Driver driver = new Driver();
			//hk.drive( new RedBus() );
			//hk.drive( new Volvo() );
			
			Scanner scn = new Scanner(System.in);
			
			System.out.print("Enter Vehicle Name: ");
			vehicleName = scn.next();

			//Reflection API
			Class clazz = Class.forName(vehicleName); //loading given class into JVM
			Object obj = clazz.newInstance();		  //instantiating loaded class 	
			
			//checking type of the object
			if(obj instanceof Vehicle v){ //Java 14v 
				//Vehicle v = (Vehicle)obj;
				//driver.drive(v);
			} else {
				System.out.println(
					vehicleName + " is not Vehicle type");
			}	

		}catch(ClassNotFoundException e){ 
			System.out.println(	"Error: " + vehicleName +".class is not found");

		}catch(InstantiationException e) {
			System.out.println(
			"Error: no-param constructor is not found in " + vehicleName +" class");

		}catch(IllegalAccessException e){ 
			System.out.println(
			"Error: no-param constructor is not visible in " 
				                       + vehicleName +" class");
		}
	}
}

//Now this project is 100% dynamic, means 
//user classes Driver and BusDemo can access
//Vehicle implementation classes objects at runtime.

//When we need to change one Vehicle type to another 
//Vechicle type, we no need to modify code
//any where in the project.