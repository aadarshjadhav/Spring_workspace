package com.demo.crud.controller;

import java.beans.Expression;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.crud.iservice.IProductService;
import com.demo.crud.models.Product;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/product")
public class CrudController {
	
	@Autowired
	private IProductService productservice;
	
	@GetMapping("/getallProducts")
	public List<Product> getAllProducts()
	{
		return productservice.getAllProducts();
	}

	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product p)
	{
		System.out.println("Inside saveProduct");
		Product res=null;

		try {
			res=productservice.saveProduct(p);
			System.out.println("Save Product Done");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return res;
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product p)
	{
		System.out.println("Inside updateProduct");
		Product res=null;

		try {
			res=productservice.updateProduct(p);
			System.out.println("updateProduct Product Done");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return res;
	}
	

	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		try 
		{
			productservice.deleteProduct(id);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	

	@GetMapping("/searchProductById/{id}")
    public Product searchProductById(@PathVariable int id) {
		Product res=null;
		try 
		{
			res=productservice.searchProductById(id);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return res;
    }
	

}
