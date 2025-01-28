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
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="JPA_OTM_PHONE_NUMBER1")
@Setter
@Getter
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class PhoneNumber {
	@Id
	@GeneratedValue(generator="gen1", strategy=GenerationType.AUTO)
	private Integer reg_id;
	@NonNull
	private Long phone;
	@Column(length=20)
	@NonNull
	private String type;
	@Column(length=20)
	@NonNull
	private String provider;
	@ManyToOne(targetEntity=Person.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="PERSON_ID",referencedColumnName="PID")
	private Person person;
	public PhoneNumber() {
		System.out.println("PhoneNumber::0-param constructor"+this.getClass());
	}
	@Override
	public String toString() {
		return "PhoneNumber [regId=" + reg_id + ", phone=" + phone + ", provider=" + provider + ", type="
				+ type + "]";
	}
	
}
