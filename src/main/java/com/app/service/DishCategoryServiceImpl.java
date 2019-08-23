package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.DishCategoryRepository;
import com.app.entity.DishCategory;

@Service
public class DishCategoryServiceImpl implements DishCategoryService {

	@Autowired
	DishCategoryRepository dishcategoryRepository;

	@Override
	public void deleteDishCategory(Integer id) {
		dishcategoryRepository.deleteDishCategory(id);
	}

	@Override
	public DishCategory getDishCategoryByEmail(String email) {
		return dishcategoryRepository.getDishCategoryByEmail(email);
	}

	@Override
	public DishCategory getDishCategoryById(Integer id) {
		return dishcategoryRepository.getDishCategoryById(id);
	}

	@Override
	public void insertDishCategory(DishCategory dishcategory) {
		dishcategoryRepository.insertDishCategory(dishcategory);
	}

	@Override
	public List<DishCategory> viewDishCategory() {
		return dishcategoryRepository.viewDishCategory();
	}

}
