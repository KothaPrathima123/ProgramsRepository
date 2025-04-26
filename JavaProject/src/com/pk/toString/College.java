package com.pk.toString;

class Student {
		int sno;
		String sname;
		String course;
		double fee;

		@Override
		public String toString(){
			return		"  sno\t\t: "		+ sno		+ "\n"+
						"  sname\t\t: "		+ sname		+ "\n" +	
						"  course\t: "		+ course	+ "\n" +	
						"  fee\t\t: "		+ fee;	
		}
	}
	public class College{
		public static void main(String[] args) {
			Student s1 = new Student();


			System.out.println(s1);	 //s1.toString() -> object data is display
			System.out.println();	 

			s1.sno	  = 101;
			s1.sname  = "PK";
			s1.course = "CJ";
			s1.fee    = 2500;

			System.out.println(s1);	//s1.toString() -> object data is display
		}

}
