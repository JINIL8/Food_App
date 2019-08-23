package com.app.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.service.DishCategoryService;
import com.app.entity.DishCategory;

@Component
public class DishCategoryBO {

	@Autowired
	DishCategoryService dishcategoryService;

	public void deleteDishCategory(Integer id) {
		dishcategoryService.deleteDishCategory(id);
	}

	public DishCategory getDishCategoryByEmail(String email) {
		return dishcategoryService.getDishCategoryByEmail(email);
	}

	public DishCategory getDishCategoryById(Integer id) {
		return dishcategoryService.getDishCategoryById(id);
	}

	public void insertDishCategory(DishCategory dishcategory) {
		dishcategoryService.insertDishCategory(dishcategory);
	}

	public List<DishCategory> viewDishCategory() {
		return dishcategoryService.viewDishCategory();
	}

}
