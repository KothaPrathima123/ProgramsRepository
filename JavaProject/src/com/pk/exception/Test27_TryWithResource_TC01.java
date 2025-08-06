package com.pk.exception;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class  Test27_TryWithResource_TC0{
	public static void main(String[] args) {

		try(	
			FileOutputStream fos2 = 
				new FileOutputStream("abc.txt");
		){
			fos2.write('b');
			System.out.println("Data saved successfully");
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}