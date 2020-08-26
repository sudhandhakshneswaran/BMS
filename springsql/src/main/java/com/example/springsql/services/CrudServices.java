package com.example.springsql.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.springsql.Repo.CrudRepo;
import com.example.springsql.modal.Product;


@ComponentScan
@Service
public class CrudServices {
	@Autowired
	private CrudRepo repo;
	
	public List<Product> fetchProductList()
	{
		return repo.findAll();
	}
	
	public Product  saveProductToDB(Product product)
	{
		return repo.save(product);
	}
	
	public Optional<Product> fetchProductById(int id)
	{
		return repo.findById(id);
	}
	
	public String deleteProductById(int id)
	{
		String result;
		try 
		{
			 repo.deleteById(id);
			 result = "Product Removed Successfully";
		}
		catch(Exception e)
		{
			result = "Exception in Removing Product";
		}
		return result;
	}

}
