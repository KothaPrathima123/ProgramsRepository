package com.pk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pk.entity.PhoneNumber;

public interface IPhoneNumberRepository extends JpaRepository<PhoneNumber, Integer>{
	@Query("select ph.reg_id,ph.phone,ph.provider,ph.type,p.pid,p.paddrs,p.pname from PhoneNumber ph full join ph.Person p")
	public List<Object[]> showJoinsDataChildToParent();
}
