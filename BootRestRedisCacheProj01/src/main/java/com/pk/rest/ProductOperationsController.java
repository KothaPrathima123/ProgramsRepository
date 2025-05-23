package com.pk.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.entity.Product;
import com.pk.service.IProductManagementService;

@RestController
@RequestMapping("/product-api")
public class ProductOperationsController {
	@Autowired
	private IProductManagementService prodService;
	
	@GetMapping("/find/{pid}")
	public ResponseEntity<Product> findProductById(@PathVariable(name ="pid") int pid){
		//use service
		Product prod=prodService.findProductById(pid);
		return new ResponseEntity<Product>(prod,HttpStatus.OK);
	}
	@PostMapping("/save")
	public ResponseEntity<String> saveProduct(@RequestBody Product prod){
		//use service
		Product savedproduct=prodService.addProduct(prod);
		return new ResponseEntity<String>(savedproduct.toString()+" is saved",HttpStatus.OK);
	}
	@GetMapping("/report")
	public ResponseEntity<List<Product>> showAllProducts(){
		List<Product> list=prodService.showAllProducts();
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable(name="pid") Integer pid){
		//use service
		String msg=prodService.deleteProduct(pid);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	
	
	
}
