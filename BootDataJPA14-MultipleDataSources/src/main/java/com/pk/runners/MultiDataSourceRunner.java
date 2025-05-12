package com.pk.runners;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pk.model.prod.Product11;
import com.pk.model.promotions.Offers;
import com.pk.repo.prod.IProductRepo;
import com.pk.repo.promotions.IOffersRepo;

@Component
public class MultiDataSourceRunner implements CommandLineRunner{
	@Autowired
	private IProductRepo prodRepo;
	@Autowired
	private IOffersRepo offersRepo;
	@Override
	public void run(String... args) {
		prodRepo.saveAll(Arrays.asList(new  Product11("chair", 1990.0, 34.0),new Product11("table",34.0,60.9)));
		System.out.println("Products are saved");
		System.out.println("======================");
		
		offersRepo.saveAll((Arrays.asList(new Offers("buy-1-get-1", "B1G1", 23.9,LocalDateTime.of(2021,11,10,20,11)),
				new Offers("buy-1-get-2", "B1G2", 23.9,LocalDateTime.of(2021,11,10,20,11)),
						new Offers("buy-1-get-1", "B1G3", 23.9,LocalDateTime.of(2021,11,10,20,11)
				))));
	System.out.println("===display record products====");
	prodRepo.findAll().forEach(System.out::println);
	System.out.println("===display record(offers)====");
	offersRepo.findAll().forEach(System.out::println);
	}

}
