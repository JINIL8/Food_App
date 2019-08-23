package com.app.repository;

import java.util.List;

import com.app.entity.Dishes;

public interface DishesRepository {

	void deleteDishes(Integer id);

	Dishes getDishesByEmail(String email);

	Dishes getDishesById(Integer id);

	void insertDishes(Dishes dishes);

	List<Dishes> viewDishes();

}
