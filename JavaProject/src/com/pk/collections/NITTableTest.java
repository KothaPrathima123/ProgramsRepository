package com.pk.collections;

import java.util.Arrays;

class NITtable {
	
	private Object[] keys;
	private Object[] values;
	private int 	 elementCount;
	
	NITtable(){
		keys = new Object[10];
		values = new Object[10];
	}
	
	public void put(Object key, Object value) {
		if(size() == capacity()) {
			grow();
		}
		keys[elementCount] = key;
		values[elementCount] = value;
		elementCount++;
	}
	
	private void grow() {
		
		Object[] nextKeyArray = new Object[capacity() *2];
		Object[] nextValueArray = new Object[capacity() *2];
		
		for(int i=0; i<keys.length; i++) {
			nextKeyArray[i] = keys[i];
			nextValueArray[i] = values[i];
		}
		
		keys = nextKeyArray;
		values = nextValueArray;
	}

	public int capacity() {
		return keys.length;
	}
	
	public int size() {
		return elementCount;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(keys) + "\n"+Arrays.toString(values);
	}
}

public class NITTableTest {
public static void main(String[] args) {
		
		NITtable table = new NITtable();
		System.out.println("Capacity: "+ table.capacity());
		System.out.println("Size    : "+ table.size());
		System.out.println("Eles    : \n"+ table);
		System.out.println();
		
		table.put(1, "a");
		table.put(2, "b");
		table.put(3, 5);
		table.put(4, 6.7);
		table.put(5, 'p');
		table.put(6, true);
		table.put(7, null);
		table.put(8, new Ex(5, 6));
		table.put(9, "a");
		table.put(10, 5);
		
		System.out.println("Eles    : \n"+ table);
		System.out.println("Capacity: "+ table.capacity());
		System.out.println("Size    : "+ table.size());
		System.out.println();
		
		table.put(11, 6.7);
		System.out.println("Eles    : \n"+ table);
		System.out.println("Capacity: "+ table.capacity());
		System.out.println("Size    : "+ table.size());
		System.out.println();
	}
}
