package com.pk.repo.promotions;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.model.promotions.Offers;

public interface IOffersRepo extends JpaRepository<Offers, Integer>{

}
