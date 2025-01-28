package com.pk.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Employee {
	@Id
	private Integer id;
	private String empName;
	private String empDept;
	private Double empSal;

}
