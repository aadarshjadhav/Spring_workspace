package com.demo.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.crud.iservice.IProductService;
import com.demo.crud.models.Product;
import com.demo.crud.repositories.ProductRepo;

@Service
public class ProductService implements IProductService{

	@Autowired
	private ProductRepo productrepo;
	
	@Override
	public List<Product> getAllProducts() {
		
		List<Product> productlist = productrepo.findAll();
		
		return productlist;
	}

	@Override
	public Product saveProduct(Product p) {

		Product res= productrepo.save(p);
		return res;
	}

	@Override
	public Product updateProduct(Product p) { //Same code as save method
		Product res= productrepo.save(p);
		return res;
	}

	@Override
	public void deleteProduct(int id) {

		productrepo.deleteById(id);
	}

	@Override
    public Product searchProductById(int id) {
        
		@SuppressWarnings("deprecation")
        Product product = productrepo.getById(id);
        return mapToDTO(product);
    }

    private Product mapToDTO(Product product) {
        Product p = new Product();
        p.setId(product.getId());
        p.setName(product.getName());
        p.setPrice(product.getPrice());
        p.setDescription(product.getDescription());
        return p;
    }

}
