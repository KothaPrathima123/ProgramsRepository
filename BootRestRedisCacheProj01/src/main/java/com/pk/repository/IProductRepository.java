package com.pk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Integer>{

}
