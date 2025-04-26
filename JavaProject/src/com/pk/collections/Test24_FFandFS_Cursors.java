package com.pk.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test24_FFandFS_Cursors {
	public static void main(String[] args) {
		
		Vector<Object> v1 = new Vector<>();
		v1.add("a");
//=====================legacy implementation ==================================		
			Enumeration<Object> e1 = v1.elements();  //FS
			System.out.println(e1.nextElement());
			
		v1.add(5);
			System.out.println(e1.nextElement());	//no CME
			
//======================CsF implementation =================================		
			Enumeration<Object> e2 = Collections.enumeration(v1); //FF
		v1.add("b");	
			
			//System.out.println(e2.nextElement()); //RE: CME
//================================= =================================
		CopyOnWriteArrayList<Object> cal = new CopyOnWriteArrayList<>();	
		cal.add("a");
		cal.add(5);
		cal.add("b");
		cal.add(6);
		System.out.println(cal);
			Iterator<Object> itr = cal.iterator();
		cal.add("c");
		System.out.println(cal);
			System.out.println(itr.next()); //a
			System.out.println(itr.next()); //5
			System.out.println(itr.next()); //b
			System.out.println(itr.next()); //6
			
			//System.out.println(itr.next()); //RE: NSE 
			
	}
}