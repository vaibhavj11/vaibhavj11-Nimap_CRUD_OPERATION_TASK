package com.example.demo.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Category;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Service.CategoryService;

@Service
public class CategoryDao implements CategoryService {

    // This implimentation needs to be private

	@Autowired
	CategoryRepository cr;

	@Override
	public List<Category> getAllCategories(Category category) {
		// TODO Auto-generated method stub
		
		return cr.findAll();
	}

	@Override
	public void addNewCategory(Category category) {
		// TODO Auto-generated method stub
		cr.save(category);
	}

	@Override
	public Optional<Category> getCategoryById(Integer id) {
		// TODO Auto-generated method stub
		return cr.findById(id);
	}

	@Override
	public void updateCategoryById(Integer id, Category category) {
		// TODO Auto-generated method stub
		
		cr.save(category);
		
	}

	@Override
	public void deleteCategoryById(Integer id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}

	

	
	
}
