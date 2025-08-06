package com.pk.service;

import java.util.List;

import com.pk.entity.Product;

public interface IProductManagementService {
	public Product addProduct(Product prod);
	public List<Product> showAllProducts();
	public String deleteProduct(int pid);
	public Product findProductById(int pid);

}
