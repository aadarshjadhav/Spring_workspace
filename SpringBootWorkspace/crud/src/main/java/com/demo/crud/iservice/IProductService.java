package com.demo.crud.iservice;

import java.util.List;

import com.demo.crud.models.Product;

public interface IProductService {
	
	List<Product> getAllProducts();
	Product saveProduct(Product p);
	Product updateProduct(Product p);
	void deleteProduct(int d);
	Product searchProductById(int d);

}
