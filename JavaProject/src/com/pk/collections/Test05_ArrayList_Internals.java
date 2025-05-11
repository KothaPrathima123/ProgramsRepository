package com.pk.collections;

import java.util.ArrayList;

public class Test05_ArrayList_Internals {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		System.out.println("size: "+ al.size()); 	//0
		System.out.println("eles: "+ al); 			//[]
		System.out.println(); 	
		
	//Operation #1: Addition object	
		al.add("a");
		al.add("b");
		al.add(5);
		al.add(6.7);
		al.add('p');
		al.add(true);
		al.add(null);
		al.add(new Ex(5, 6));
		al.add(new Sa(5, 6));
		al.add("a");
		al.add(5);

	//Operation #2: Counting objects	
		System.out.println("size: "+ al.size()); 	

	//Operation #3: Printing objects	
		System.out.println("eles: "+ al); 			
		System.out.println();
		
	//Operation #4: Searching for an object	
		System.out.println(al.contains("a"));
							//"a".equals(ele: "a"); //data comparison
		System.out.println(al.contains(new String("a")));
							//new String("a").equals(ele:"a"); //data comparison
		System.out.println(al.contains(5));
							//((Integer)5).equals(ele: "a") -> false
							//((Integer)5).equals(ele: "b") -> false
							//((Integer)5).equals(ele: 5) 	-> true
		System.out.println(al.contains(new Integer(5)));
							//(new Integer(5)).equals(ele: "a") -> false
							//(new Integer(5)).equals(ele: "b") -> false
							//(new Integer(5)).equals(ele: 5) 	-> true
											//data comparison
		System.out.println(al.contains(new Ex(5, 6))); //ref wise comparison
							//(new Ex(5,6)).equals(ele: "a") -> false
							//(new Ex(5,6)).equals(ele: "b") -> false
							//(new Ex(5,6)).equals(ele: 5) 	-> false
							//(new Ex(5,6)).equals(ele: 6.7)-> false
							//(new Ex(5,6)).equals(ele: 'a')-> false
							//(new Ex(5,6)).equals(ele: true)-> false
							//(new Ex(5,6)).equals(ele: null)-> false
							//(new Ex(5,6)).equals(ele: new Ex(5,6));-> false
							//(new Ex(5,6)).equals(ele: new Sa(5,6));-> false
							//(new Ex(5,6)).equals(ele: "a");-> false
							//(new Ex(5,6)).equals(ele: 5);-> false
		System.out.println(al.contains(new Sa(5, 6))); //data wise comparison
							//(new Sa(5,6)).equals(ele: "a") -> false
							//(new Sa(5,6)).equals(ele: "b") -> false
							//(new Sa(5,6)).equals(ele: 5) 	-> false
							//(new Sa(5,6)).equals(ele: 6.7)-> false
							//(new Sa(5,6)).equals(ele: 'a')-> false
							//(new Sa(5,6)).equals(ele: true)-> false
							//(new Sa(5,6)).equals(ele: null)-> false
							//(new Sa(5,6)).equals(ele: new Ex(5,6));-> false
							//(new Sa(5,6)).equals(ele: new Sa(5,6));-> true
		System.out.println(al.contains(null)); //== comparison
							//null=="a") -> false
							//null=="b") -> false
							//null==5) 	-> false
							//null==6.7)-> false
							//null=='a')-> false
							//null==true)-> false
							//null==null)-> true
		
	}
}