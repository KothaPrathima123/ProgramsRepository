package com.pk.model;

import lombok.Data;

@Data
public class Address {
	private String houseNo;
	private String streetName;
	private String location;
	private Long pinCode;
}
