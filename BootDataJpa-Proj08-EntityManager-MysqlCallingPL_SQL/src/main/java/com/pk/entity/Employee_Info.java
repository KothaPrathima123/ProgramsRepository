package com.pk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee_Info {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer empno;
	private String ename;
	private String desg;
	private Double sal;
	//private Double gross_salary;
	//private Double net_salary;
	public Integer getEno() {
		return empno;
	}
	public void setEno(Integer eno) {
		this.empno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public Double getSalary() {
		return sal;
	}
	public void setSalary(Double salary) {
		this.sal = sal;
	}

	/*
	 * public Double getGross_salary() { return gross_salary; } public void
	 * setGross_salary(Double gross_salary) { this.gross_salary = gross_salary; }
	 * public Double getNet_salary() { return net_salary; } public void
	 * setNet_salary(Double net_salary) { this.net_salary = net_salary; }
	 */
	//setters and getters
	//toString
	@Override
	public String toString() {
		return "Employee_Info [eno=" + empno + ", ename=" + ename + ", desg=" + desg + ", salary=" + sal
				+ ", gross_salary="  + "]";
	}
	
	
	
}
