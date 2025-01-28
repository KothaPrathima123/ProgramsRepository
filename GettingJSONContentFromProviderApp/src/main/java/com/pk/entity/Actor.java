package com.pk.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
	private Integer id;
	private String name;
	private String addrs;
	private Float remuneration;
}
