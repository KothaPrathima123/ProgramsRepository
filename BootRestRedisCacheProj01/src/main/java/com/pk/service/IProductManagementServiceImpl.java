package com.pk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.pk.entity.Product;
import com.pk.repository.IProductRepository;
@Service
public class IProductManagementServiceImpl implements IProductManagementService {
	@Autowired
	private IProductRepository prodRepo;
	@CachePut(value="prods",key="#product.pid")
	@Override
	public Product addProduct(Product product) {
		Product savedProduct=prodRepo.save(product);
		return savedProduct;
	}
	@Cacheable(value="prods")
	@Override
	public List<Product> showAllProducts() {
		return prodRepo.findAll();
	}

	@Override
	@CacheEvict(value="prods",key="#pid")
	public String deleteProduct(int pid) {
		Optional<Product> opt=prodRepo.findById(pid);
		if(opt.isPresent()) {
			prodRepo.deleteById(pid);
		return "Product found and deleted";
	}
	return "Product is not found for deletion";
}
	@Override
	@Cacheable(value="prods",key="#pid")
	public Product findProductById(int pid) {
	return prodRepo.findById(pid).orElseThrow(()->new IllegalArgumentException("invalid pid"));	
	}

}
