package com.pk.model;

import java.io.Serializable;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="boot_emp")
@Data
@SQLDelete(sql="UPDATE BOOT_EMP SET STATUS='INACTIVE' WHERE EMPNO=?")
@Where(clause="STATUS <> 'deleted' ")
public class Employee implements Serializable{
	
	@Id
	 @GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	    @SequenceGenerator(name = "gen1", sequenceName = "emp_no_seq1", initialValue=3000,allocationSize = 1)
	    private Integer empno;
	
	@Column(length=20)
	private String ename;
	@Column(length=20)
	private String job;
	
	private Float sal;
	private Integer deptno=10;
	private String status="active";
}
