package com.pk.oops;

public class Student extends Person {

	private static String institute;
	
	private int sno;
	private String course;
	private double fee;
/*	
	public Student(String name, double height, double weight
						int sno, String course, double fee) {

		super(name, height, weight);

		this.sno	= sno;
		this.course = course;
		this.fee	= fee;

	}
*/	
	public static String getInstitute() {
		return institute;
	}
	public static void setInstitute(String institute) {
		Student.institute = institute;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public void listen() { 
		System.out.println(getName() + " is listening "+ course);
	}
	
	public void reply() { 
		System.out.println(getName() + " is replying to "+ course + " questions");
	}
	
	public void read() {
		System.out.println(getName() + " is reading "+ course + " material");
	}
	
	public void write() { 
		System.out.println(getName() + " is writing " + course + " notes");
	}
	
	@Override
	public String toString() {
				
		return	super.toString() + "\n" +
				(" institute\t: "	+ institute) + "\n" +
				(" sno\t\t: "		+ sno)		+ "\n" +
				(" course\t\t: "	+ course)	+ "\n" +
				(" fee\t\t: "		+ fee);
	}	
}