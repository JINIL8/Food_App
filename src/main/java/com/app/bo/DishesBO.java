package com.app.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.service.DishesService;
import com.app.entity.Dishes;

@Component
public class DishesBO {

	@Autowired
	DishesService dishesService;

	public void deleteDishes(Integer id) {
		dishesService.deleteDishes(id);
	}

	public Dishes getDishesByEmail(String email) {
		return dishesService.getDishesByEmail(email);
	}

	public Dishes getDishesById(Integer id) {
		return dishesService.getDishesById(id);
	}

	public void insertDishes(Dishes dishes) {
		dishesService.insertDishes(dishes);
	}

	public List<Dishes> viewDishes() {
		return dishesService.viewDishes();
	}

}
