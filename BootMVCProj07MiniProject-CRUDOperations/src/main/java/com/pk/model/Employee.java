package com.pk.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="emp")
@Data
public class Employee implements Serializable{
	
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_id_seq_gen")
	    @SequenceGenerator(name = "emp_id_seq_gen", sequenceName = "emp_id_seq", allocationSize = 1)
	    private Integer empno;
	
	@Column(length=20)
	private String ename;
	@Column(length=20)
	private String job;
	
	private Float sal;
	private Integer deptno;
}
