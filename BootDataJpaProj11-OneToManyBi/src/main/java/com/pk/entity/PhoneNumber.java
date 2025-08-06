package com.pk.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="JPA_OTM_PHONES")
@Setter
@Getter
@RequiredArgsConstructor
public class PhoneNumber {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer regId;
	@NonNull
	private  Long   phone;
	@NonNull
	@Column(length = 20)
	private  String type;
	@NonNull
	@Column(length = 20)
	private  String provider;
	
	@ManyToOne(targetEntity=Person.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSON_ID",referencedColumnName = "PID")// for fk relation
	private  Person person;
	
	public PhoneNumber() {
		System.out.println("PhoneNumber:: 0-param constructor::"+this.getClass());
	}

	@Override
	public String toString() {
		return "PhoneNumber [regId=" + regId + ", phone=" + phone + ", type=" + type + ", provider=" + provider + "]";
	}
	
	//alt+Shift+s,s
	

}
