package com.pk.collections;

import java.util.ArrayList;

public class Test05_ArrayList {
	
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
			al.add(new Sa(5, 6));
			al.add('p');
			al.add(true);
			al.add(null);
			al.add(new Ex(5, 6));
			al.add("a");
			al.add(5);

		//Operation #2: Counting objects	
			System.out.println("size: "+ al.size()); 	

		//Operation #3: Printing objects	
			System.out.println("eles: "+ al); 			
			System.out.println();
			
		//Operation #4: Searching for an object	to know whether it is available or not 
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
			System.out.println();
			
		//Operation #5: Searching for an object	to know its index
			System.out.println(al.indexOf("a")); //same as contains() method
			System.out.println(al.indexOf("A")); //it also internally uses
			System.out.println(al.indexOf(new String("a"))); //equals() method
			
			System.out.println(al.indexOf(5)); 
			System.out.println(al.indexOf((Integer)5));
			
			System.out.println(al.indexOf(null)); 			//==opeator 
			System.out.println(al.indexOf(new Ex(5,6)));  //eqs is !overridden
			System.out.println(al.indexOf(new Sa(5,6)));  //eqs is overridden
			System.out.println();
			System.out.println(al.lastIndexOf("a"));
			System.out.println(al.lastIndexOf(5));
			System.out.println(al.lastIndexOf(null));
			System.out.println(al.lastIndexOf(new Ex(5,6)));
			System.out.println(al.lastIndexOf(new Sa(5,6)));
			System.out.println(al.lastIndexOf("A"));
			System.out.println();
			
		//Operation #6: Retrieving an object from the given index (>=0 &&<size())
			System.out.println(al.get(0));
			System.out.println(al.get(3));
			//System.out.println(al.get(-1));	//Rule #1: index >=0 && <size()
			System.out.println(al.get(10));
			//System.out.println(al.get(11));
			System.out.println();
												 		
			//String s1 = al.get(0); //String obj ref 111 is returned as Object type
						//because get() return type is Object
								//Rule #2: we can not assign to returning objectt
								//type ref variable, because get() retun type is 
								//object
			Object obj = al.get(0);
			System.out.println(obj);		//Rule #3: we can not invoke 
			//System.out.println(obj.toUpperCase());//returned object specific 
													//members by using obj
			
			//String s1 = (String)obj;	//Rule #4: may get CCE 
			//System.out.println(s1.toUpperCase());
			
			if(obj instanceof String s1) { //java 14v new feature
				System.out.println(s1.toUpperCase());
			}
			
			//for(int i=0; i<=al.size(); i++) { //Rule #5: condition must	 
			//for(int i=0; i<=al.size()-1; i++) {		//<size() 0r
			for(int i=0; i<al.size(); i++) {			//<=size()-1
				System.out.print(al.get(i) + " ");			
			}
			System.out.println();
			
			//Sa s1 = (Sa)al.get(8); //static way of retrieving object
			
			//search and retrieving by passing index dynamically 
			int index = al.indexOf(new Sa(5, 6)); //equals()
			if(index>=0) {
				Sa s1 = (Sa)al.get(index); //dynamic way of retrieving object=>IOOBE
				System.out.println(s1.getX() +" "+s1.getY());
				s1.setX(s1.getX()+10);
				s1.setY(s1.getY()+10);
				System.out.println(s1.getX() +" "+s1.getY());
				System.out.println(al);
			}
		}
}
