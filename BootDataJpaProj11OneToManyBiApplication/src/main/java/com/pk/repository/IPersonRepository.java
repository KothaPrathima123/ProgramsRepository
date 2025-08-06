package com.pk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pk.entity.Person;

public interface IPersonRepository extends JpaRepository<Person,Integer>{
@Query("select p.pid,p.paddrs,p.pname,ph.reg_id,ph.phone,ph.type,ph.provider from Person p inner join p.PhoneNumber ph")
/*
 * @Query("select p.pid,p.pname,p.paddrs,ph.regId,ph.type,ph.provider,ph.phone from Person p left join p.phones ph"
 * )
 * 
 * @Query("select p.pid,p.pname,p.paddrs,ph.regId,ph.type,ph.provider,ph.phone from Person p right join p.phones ph"
 * )
 * 
 * @Query("select p.pid,p.pname,p.paddrs,ph.regId,ph.type,ph.provider,ph.phone from Person p full join p.phones ph"
 * )
 */
public List<Object[]> fetchDataByJoinsUsingParent();
	
}
