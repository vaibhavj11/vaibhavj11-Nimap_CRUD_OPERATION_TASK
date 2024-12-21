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

import com.example.demo.Model.Category;
import com.example.demo.Service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	@Autowired
	private CategoryService cs;
	
	
	@GetMapping("/getAll")
	public List<Category> getAll(Category category){
		
		return cs.getAllCategories(category); 
	}
	
	@PostMapping
	public String addNewOne(@RequestBody Category category) {
		
		cs.addNewCategory(category);
		
		return "New Category Added Successfully !";
	}
	
	@GetMapping("/{id}")
	public Optional<Category> getCategoryById(@PathVariable Integer id) {
		
		return cs.getCategoryById(id);
		
	}
	
	@PutMapping("/{id}")
	public String update(@PathVariable Integer id,@RequestBody Category category) {
		
		cs.updateCategoryById(id,category);
		
		return "Category updated successfully !";
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Integer id) {
		
		cs.deleteCategoryById(id);
		
		return "Category Deleted Successfully !";
	}
	
}
