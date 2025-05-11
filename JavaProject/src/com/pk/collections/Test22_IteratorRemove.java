package com.pk.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test22_IteratorRemove {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		Iterator<Object> itr = al.iterator();
		
		//itr.remove(); //remove() removes the next() returned object
						//it means we must call remove() after next() call
						//and also only once
						//else we will get RE: IllegalStateException
		itr.next();
		itr.remove();
		//itr.remove(); //RE: ISE
		System.out.println(al);
		
		while(itr.hasNext()) {
			Object obj = itr.next();
			//itr.remove(); //can call here, 
							//but all elements are removed 
			
			//if(obj instanceof Integer) { //only integers are removed
			if(obj instanceof String) {	//only strings are removed
				itr.remove();
			}
		}
		itr.remove(); //RE: ISE with instanceof Integer
		System.out.println(al);
	}
}