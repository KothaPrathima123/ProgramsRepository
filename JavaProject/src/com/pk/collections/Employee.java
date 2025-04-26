package com.pk.collections;

import java.util.HashMap;

class Employee{

	private int		eno;
	private String	ename;
	private double	sal;
	private String	dept;

	private static HashMap<String, Integer> deptsMap = new HashMap<String, Integer>();
	static{
		deptsMap.put("Java", 1);
		deptsMap.put(".NET", 2);
		deptsMap.put("Oracle", 3);
		deptsMap.put("PHP", 4);
		deptsMap.put("Android", 5);
		deptsMap.put("HADOOP", 6);
	}

	public Employee(int eno, String ename, 
						double sal, String dept){
	
		this.eno		= eno;
		this.ename	= ename;
		this.sal		= sal;
		this.dept		= dept;

	}

	@Override
	public int hashCode(){
		return deptsMap.get(this.dept);
	}

	@Override
	public boolean equals(Object obj){
	
		if(obj instanceof Employee){
			Employee e = (Employee) obj;
			
			return (this.eno == e.eno) &&
					(this.dept.equals(e.dept));
	
		}
	
		return false;
	}

	@Override
	public String toString(){
		return "Employee("+
				eno		+", "+
				ename	+", "+
				sal		+", "+
				dept		+", "
			    +")";
	}
}
