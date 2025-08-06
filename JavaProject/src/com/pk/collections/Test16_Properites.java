package com.pk.collections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test16_Properites {
	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		p.setProperty("sno", "101");
		p.setProperty("sname", "HK");
		p.setProperty("course", "CJ");
		p.setProperty("fee", "3500");
		p.put("institute", "NiT");
		//p.put(new Sa(1,2), "NiT"); //Line 18 throws CCE
		System.out.println(p);
		
		p.store(new FileWriter("student.properties"), "Student details");
		System.out.println("data is stored successfully");
	}
}