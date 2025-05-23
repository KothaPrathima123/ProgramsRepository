
package com.pk.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="JPA_OTM_PERSON")
@Setter
@Getter
@RequiredArgsConstructor
public class Person {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "PID_SEQ",initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
   private Integer pid;
	@Column(length = 20)
	@NonNull
	private  String  pname;
	@Column(length = 20)
	@NonNull
	private  String  paddrs;
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,fetch=FetchType.EAGER,mappedBy = "person")
//	@JoinColumn(name = "PERSON_ID",referencedColumnName = "PID")  //FK column  info
	private Set<PhoneNumber>  phones;
	
	public Person() {
		System.out.println("Person:: -param constructor::"+this.getClass());
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + "]";
	}
	
	
	
	
}
