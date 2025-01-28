package com.example.demo.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.Service.ProductService;

@Service
public class ProductDao implements ProductService {

	//This implimentation needs to be private

	@Autowired
	ProductRepository pr;

	@Override
	public List<Product> getAllProduct(Product product) {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public void addNewProduct(Product product) {
		// TODO Auto-generated method stub
		pr.save(product);
	}

	@Override
	public Optional<Product> getProductById(Integer id) {
		// TODO Auto-generated method stub
		return pr.findById(id);
	}

	@Override
	public void updateProductById(Integer id, Product product) {
		// TODO Auto-generated method stub
		pr.save(product);
	}

	@Override
	public void deleteProductById(Integer id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
	}

	

	

	
	
	
}
