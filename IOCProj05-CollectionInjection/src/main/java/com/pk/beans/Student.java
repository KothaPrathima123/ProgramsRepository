package com.pk.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private int marks[];
	private List<String> colors;
	private List<String> names;
	private Set<String> phones;
	private Map<?,?> facultySubjects;
	private Map<?,?> facultyPhones;
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}

	public void setFacultyPhones(Map<?,?> facultyphones) {
		this.facultyPhones = facultyphones;
	}
	public void setFacultySubjects(Map<String,String> facultysubjects) {
		this.facultySubjects = facultysubjects;
	}
	public void setColors(List<String> names) {
		this.colors = names;
	}
	@Override
	public String toString() {
		return "Student [marks=" + Arrays.toString(marks) + ", colors=" + colors + "names"+" "+names+"phones"+" "+phones+"faculty Subjects"+" "+facultySubjects+" faculty phones "+facultyPhones+"]";
	}
	

}
