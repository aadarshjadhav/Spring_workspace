package com.demo.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.crud.models.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{
	
	

}
