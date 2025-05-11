package com.pk.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test30_StreamAPI {
	public static void main(String[] args) {
		/*
		 * We can create Collection objects in three ways
		 * 	1. by using new keyword and constructor		
		 * 	2. by using Arrays.asList(e1, e2, e3, ...) 
		 * 	3. by using List.of(e1, e2, e3, ...)
		 * 	   by using Set.of(e1, e2, e3, ...)
		 *     by using Map.of(k1, v1, k2, v2, k3, v3, ...)	
		 */
		//1.2v
		List<String> list1 = Arrays.asList("abc", "bbc", "cbc", "dbded");
		
		//9v
		List<String> list2 = List.of("abc", "bbc", "cbc", "dbded");
		
				
		//logical programming sytle by using for-each loop 
		for(String s : list2) {				//iteration
			if(s.contains("c"))				//filtering
				System.out.println(s);		//printing
		}
		System.out.println("===================");
		
		//OOP with Functional style programing by using stream
		list2.stream()							//source
			 .forEach(System.out::println);		//terminal operation
		
		System.out.println();
				
		list2.stream()							//source	
			.filter(s -> s.contains("c"))		//intermediate operation
			.forEach(System.out::println);		//terminal operation
		System.out.println();

		list2.stream()							//source
			.filter(s -> s.contains("b"))		//intermediate operation1	
			.filter(s -> s.length()>3)			//intermediate operation2
			.forEach(System.out::println);		//terminal operation
			System.out.println();
			
		list2.stream()							//source
			.filter(s -> s.contains("b"))		//intermediate operation1
			.filter(s -> s.length()>3)			//intermediate operation2
			.map( s -> s.toUpperCase())			//intermediate operation3
			.forEach(System.out::println);		//terminal operation
			
		
		ArrayList<Object> al1 = new ArrayList<>();
		al1.add("a");
		al1.add(5);
		al1.add("b");
		al1.add(6);
		al1.add("c");
		al1.add(7);
		
		System.out.println(al1);

		al1.stream()								//obtaining Stream object
		.forEach(obj -> System.out.println(obj)); 	//hiding for loop retrieving all elements
	
	System.out.println();
//=========================================================================================		
	al1.stream()									//stream with all elements
		.filter(ele -> ele instanceof String )  	//stream with only String type elements
		.forEach(ele -> System.out.println(ele)); 	//displaying string object
	System.out.println();
//=========================================================================================		
	al1.stream()									//stream with all elements
		.filter(ele -> ele instanceof Integer)		//stream with only integers
		.filter(ele -> ((int)ele)%2==0 )			//stream with only even numbers
		.forEach(System.out::println);
	System.out.println();

	//Create a collection of names
			ArrayList<String> al2 = new ArrayList<>();
			al2.add("Hari Krishna");
			al2.add("Balayya");
			al2.add("Pavan Kalyan");
			al2.add("Mahesh Babu");
			al2.add("Ravi Teja");
			
			//retrieve all names and display		
			al2.stream()
				.forEach(System.out::println);
			System.out.println();
			
	//retrieve all names whose name length is >=10
			al2.stream()
				.filter(name -> name.length() >=10)
				.forEach(System.out::println);
				System.out.println();
				
	//retrieve all names whose name length is >=10 and contains character 'r'
			al2.stream()
				.filter(name -> name.length() >= 10)
				.filter(name -> name.toLowerCase().contains("r"))
				.forEach(System.out::println);
		
			System.out.println();
			
	//A collection with duplicate names and values
	//==========================================================================
			List<Object> list = Arrays.asList("a", 1, "b", 2, "c", 1, "d", "a", 2, 3, "b");
			long noObjects =  
					list.stream()
						.distinct()
						.count();
			
			System.out.println(noObjects);
	//==========================================================================

			Object[] elems =  
					list.stream()
						.distinct()
						.toArray();
	//==========================================================================
			
			System.out.println(Arrays.toString(elems));

			List<Object> distList =  
					list.stream()
					.distinct()
					.toList();
			
			System.out.println(distList);

	//==========================================================================		
			boolean matched = 
					list.stream()
						.anyMatch(ele -> ele.equals("a"));
			
			if(matched) {
				System.out.println("a is available");
			}else {
				System.out.println("a is not available");
				
			}
	//==========================================================================
			matched = 
					list.stream()
					.allMatch(ele -> ele.equals("a"));
			
			if(matched) {
				System.out.println("a is available");
			}else {
				System.out.println("a is not available");
			}
					
	//==========================================================================
			ArrayList<Employee01> al = new ArrayList<>();
			al.add(new Employee01(101, "Hari", 	"CJ", 50000));
			al.add(new Employee01(102, "Balayya", "CJ", 15000));
			al.add(new Employee01(103, "Pavan", 	"CJ", 10000));
			al.add(new Employee01(104, "Mahesh", 	"CJ", 20000));
			al.add(new Employee01(105, "Rocky", 	"CJ", 25000));
			
			System.out.println(al);

	//#1:
			al.stream()
			.forEach(System.out::print);
			System.out.println();

	//#2:		
			al.stream()
			.filter(ele -> ele.getEName().toLowerCase().startsWith("a"))
			.forEach(System.out::print);
			System.out.println();

	//#3:		
			al.stream()
			.filter(ele -> ele.getDept().toLowerCase().startsWith("cj"))
			.filter(ele -> ele.getSal() > 10000)
			.forEach(System.out::print);
			System.out.println();
			System.out.println();
			
	//#4:		
			boolean anyMatch = al.stream()
			.anyMatch(ele -> ele.getSal()>20000);
			if(anyMatch)
				System.out.println("employ is found");
			else
				System.out.println("Employee01 is not found");

	//#5:		
			boolean allMatch = al.stream()
					.allMatch(ele -> ele.getSal()>20000);
			if(allMatch)
				System.out.println("employ is found");
			else
				System.out.println("Employee01 is not found");
			
			System.out.println();
			
	//#6:
			al.stream()
			.map(ele -> ele.getSal())
			.forEach(System.out::println);

	//#7:		
			List<Integer> salariesList = 
					al.stream()
						.map(ele -> ele.getSal())
							.collect(Collectors.toList());
			
			System.out.println(salariesList);
		
	}
}