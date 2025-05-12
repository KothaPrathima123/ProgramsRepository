package com.pk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.entity.PhoneNumber;

public interface IPhoneNumberRepository extends JpaRepository<PhoneNumber, Integer> {

}
