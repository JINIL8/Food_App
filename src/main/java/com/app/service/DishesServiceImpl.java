package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.DishesRepository;
import com.app.entity.Dishes;

@Service
public class DishesServiceImpl implements DishesService {

	@Autowired
	DishesRepository dishesRepository;

	@Override
	public void deleteDishes(Integer id) {
		dishesRepository.deleteDishes(id);
	}

	@Override
	public Dishes getDishesByEmail(String email) {
		return dishesRepository.getDishesByEmail(email);
	}

	@Override
	public Dishes getDishesById(Integer id) {
		return dishesRepository.getDishesById(id);
	}

	@Override
	public void insertDishes(Dishes dishes) {
		dishesRepository.insertDishes(dishes);
	}

	@Override
	public List<Dishes> viewDishes() {
		return dishesRepository.viewDishes();
	}

}
