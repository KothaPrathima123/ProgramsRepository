package com.pk.collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test17_PropsLoading {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties p = new Properties();
		p.load(new FileReader("student.properties"));
		System.out.println(p);
		
		String sno = p.getProperty("sno");
		String sname = p.getProperty("sname");
		String course = p.getProperty("course");
		String fee = p.getProperty("fee");
		String insti = p.getProperty("institute");
		 
		System.out.println("sno:"+ sno);
		System.out.println("sname:"+ sname);
		System.out.println("course:"+ course);
		System.out.println("fee:"+ fee);
		System.out.println("institute:"+ insti);
	}
}