package com.pk.collections;


import java.util.LinkedHashSet;

public class Company{
	public static void main(String[] args){
		LinkedHashSet<Employee> empSet = 
				new LinkedHashSet<>();
	
		empSet.add( new Employee(101, "HB", 10000, "Java")  );
		empSet.add( new Employee(101, "HB", 10000, "Java")  );
		empSet.add( new Employee(102, "HB", 10000, "Java")  );
		empSet.add( new Employee(101, "BB", 10000, "Oracle")  );
		empSet.add( new Employee(102, "MB", 10000, "Oracle")  );
	
		System.out.println(empSet);
	}
}