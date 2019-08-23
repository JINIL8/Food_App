package com.app.repository;

import java.util.List;

import com.app.entity.DishCategory;

public interface DishCategoryRepository {

	void deleteDishCategory(Integer id);

	DishCategory getDishCategoryByEmail(String email);

	DishCategory getDishCategoryById(Integer id);

	void insertDishCategory(DishCategory dishcategory);

	List<DishCategory> viewDishCategory();

}
