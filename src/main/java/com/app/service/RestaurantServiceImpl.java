package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.RestaurantRepository;
import com.app.entity.Restaurant;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	RestaurantRepository restaurantRepository;

	@Override
	public void deleteRestaurant(Integer id) {
		restaurantRepository.deleteRestaurant(id);
	}

	@Override
	public Restaurant getRestaurantByEmail(String email) {
		return restaurantRepository.getRestaurantByEmail(email);
	}

	@Override
	public Restaurant getRestaurantById(Integer id) {
		return restaurantRepository.getRestaurantById(id);
	}

	@Override
	public void insertRestaurant(Restaurant restaurant) {
		restaurantRepository.insertRestaurant(restaurant);
	}

	@Override
	public List<Restaurant> viewRestaurant() {
		return restaurantRepository.viewRestaurant();
	}

	@Override
	public Restaurant getRestaurantByRestaurantName(String restaurantname) {
		return restaurantRepository.getRestaurantByRestaurantName(restaurantname);
	}

}
