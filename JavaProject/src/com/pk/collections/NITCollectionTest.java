package com.pk.collections;

import java.util.Arrays;

class NITCollection {
	
	private Object[] elementData;
	private int 	 elementCount;
	
	NITCollection(){
		elementData = new Object[10];
	}
	
	public void add(Object obj) {
		if(size() == capacity()) {
			grow();
		}
		elementData[elementCount] = obj;
		elementCount++;
	}
	
	private void grow() {
		
		Object[] nextArray = new Object[capacity() *2];
		
		for(int i=0; i<elementData.length; i++) {
			nextArray[i] = elementData[i];
		}
		
		elementData = nextArray;
		
	}

	public int capacity() {
		return elementData.length;
	}
	
	public int size() {
		return elementCount;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(elementData);
	}
	
}
public class NITCollectionTest {
	public static void main(String[] args) {
		
		NITCollection col = new NITCollection();
		System.out.println("Capacity: "+ col.capacity());
		System.out.println("Size    : "+ col.size());
		System.out.println("Eles    : "+ col);
		System.out.println();
		
		col.add("a");
		col.add("b");
		col.add(5);
		col.add(6.7);
		col.add('p');
		col.add(true);
		col.add(null);
		col.add(new Ex(5, 6));
		col.add("a");
		col.add(5);
		
		System.out.println("Eles    : "+ col);
		System.out.println("Capacity: "+ col.capacity());
		System.out.println("Size    : "+ col.size());
		System.out.println();
		
		col.add(6.7);
		System.out.println("Eles    : "+ col);
		System.out.println("Capacity: "+ col.capacity());
		System.out.println("Size    : "+ col.size());
		System.out.println();
	}
}