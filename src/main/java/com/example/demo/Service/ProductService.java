package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Product;

public interface ProductService {

	List<Product> getAllProduct(Product product);

	void addNewProduct(Product product);

	Optional<Product> getProductById(Integer id);

	void updateProductById(Integer id, Product product);

	void deleteProductById(Integer id);

	

	

}
