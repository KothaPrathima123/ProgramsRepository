package com.pk.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActorData {
	private Integer aid;
	private String aname;
	private Double remuneration;
	private String active_SW;

}
