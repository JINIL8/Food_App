package com.app.service;

import java.util.List;

import com.app.entity.Restaurant;

public interface RestaurantService {

	void deleteRestaurant(Integer id);

	Restaurant getRestaurantByEmail(String email);

	Restaurant getRestaurantById(Integer id);

	void insertRestaurant(Restaurant restaurant);

	List<Restaurant> viewRestaurant();

	Restaurant getRestaurantByRestaurantName(String restaurantname);

}
