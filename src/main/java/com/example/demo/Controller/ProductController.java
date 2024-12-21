package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Product;
import com.example.demo.Service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService ps;
	
	@GetMapping("/getAll")
	public List<Product> getAll(Product product) {
		
		return ps.getAllProduct(product);
	}
	
	
	@PostMapping
	public String addProduct(@RequestBody Product product) {
		
		ps.addNewProduct(product);
		
		return "New Product Added Successfully !";
	}
	
	@GetMapping("/{id}")
	public Optional<Product> getProductById(@PathVariable Integer id) {
		
		return ps.getProductById(id);
	}
	
	@PutMapping("/{id}")
	public String updateProduct(@PathVariable Integer id,@RequestBody Product product) {
		
		ps.updateProductById(id,product);
		
		return "Product updated successfully !";
	}
	
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable Integer id) {
		
		ps.deleteProductById(id);
		
		return "Product Deleted "+id+" Successfully !";
	}
	
	
}
