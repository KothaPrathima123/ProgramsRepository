package com.pk.collections;

public class Employee01 {
	private Integer empNo;
	private String EName;
	private String dept;
	private int sal;
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEName() {
		return EName;
	}
	public void seteName(String EName) {
		this.EName = EName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Employee01(Integer empNo, String EName, String dept, Integer sal) {
		super();
		this.empNo = empNo;
		this.EName = EName;
		this.dept = dept;
		this.sal = sal;
	}
	
}
