package com.pk.collections;

import java.util.HashMap;

public class Test11_HM {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<>();
		System.out.println("size   : "+ hm.size());
		System.out.println("entries: "+ hm);
		
		System.out.print(hm.put("a", 1)); System.out.println("\t"+ hm.size()+ " "+hm);
								//o1.hashCode();->97->bucket is not found
								//-> new bucket is created  
								//-> and added in this new bucket-hc-97
		System.out.print(hm.put("b", 2)); System.out.println("\t"+ hm.size()+ " "+hm);
								//o2.hashCode(); ->98->bucket is not found
								//-> new bucket is created  
								//-> and added in this new bucket-hc-98
 		System.out.print(hm.put(97, 3)); System.out.println("\t"+ hm.size()+ " "+hm);
								//o3.hashCode() -> same hashcode of o1
									//o3 == o1 -> false -> ref wise unique
									//o3.equals(o1) -> false -> type wise unique
								//o3 is added in bucket-hc-97	
		System.out.print(hm.put(98, 4)); System.out.println("\t"+ hm.size()+ " "+hm);
								//o4.hashCode() -> 98
		System.out.print(hm.put(null, 5)); System.out.println("\t"+ hm.size()+ " "+hm);
		System.out.print(hm.put('p', 6)); System.out.println("\t"+ hm.size()+ " "+hm);
		System.out.print(hm.put(true, null)); System.out.println("\t"+ hm.size()+ " "+hm);
		System.out.print(hm.put("a", 8)); System.out.println("\t"+ hm.size()+ " "+hm);
		System.out.print(hm.put(new String("a"), 9)); System.out.println("\t"+ hm.size()+ " "+hm);
		System.out.print(hm.put(97, 10)); System.out.println("\t"+ hm.size()+ " "+hm);
		System.out.print(hm.put(new Integer(97), 11)); System.out.println("\t"+ hm.size()+ " "+hm);
		System.out.print(hm.put(new Ex(5, 6), 12)); System.out.println("\t"+ hm.size()+ " "+hm);
		System.out.print(hm.put(new Ex(5, 6), 13)); System.out.println("\t"+ hm.size()+ " "+hm);
		System.out.print(hm.put(new Sa(5, 6), 14)); System.out.println("\t"+ hm.size()+ " "+hm);
		System.out.print(hm.put(new Sa(5, 6), 15)); System.out.println("\t"+ hm.size()+ " "+hm);
								//s2.hashCode() -> s1 object hashcode is matched
									//s2==s1 operator -> for comparing objects with ref
									//s2.equals(s1) -> for comparing with data
		System.out.print(hm.put(11, 16)); System.out.println("\t"+ hm.size()+ " "+hm);
		
		
	}
}