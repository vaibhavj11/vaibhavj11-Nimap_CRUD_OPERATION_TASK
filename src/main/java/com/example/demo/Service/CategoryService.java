package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Category;

public interface CategoryService {

	List<Category> getAllCategories(Category category);

	void addNewCategory(Category category);

	Optional<Category> getCategoryById(Integer id);

	void updateCategoryById(Integer id, Category category);

	void deleteCategoryById(Integer id);

	



}
