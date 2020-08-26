package com.example.springsql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsql.modal.Product;
import com.example.springsql.services.CrudServices;

@RestController
@ComponentScan
public class CurdRestController {

	@Autowired
	private CrudServices service;
	
	@GetMapping("/getproductlist")
	public List<Product> fetchProductList()
	{
		List<Product> productList = new ArrayList<Product>();
		//Logic to fetch list from database
		productList = service.fetchProductList();
		return productList;
	}
	
	@PostMapping("/addproduct")
	public Product saveProduct(@RequestBody Product product)
	{
		return service.saveProductToDB(product);
	}
	
	@GetMapping("/getproductbyid/{id}")
	public Product fetchProductById(@PathVariable int id)
	{
		return service.fetchProductById(id).get();
	}
	
	@DeleteMapping("/removeproductbyid/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		return service.deleteProductById(id);
	}
}
