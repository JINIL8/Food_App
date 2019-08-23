package com.app.repository;

import java.util.List;

import com.app.entity.Restaurant;
import com.app.entity.User;

public interface RestaurantRepository {

	void deleteRestaurant(Integer id);

	Restaurant getRestaurantByEmail(String email);

	Restaurant getRestaurantById(Integer id);

	void insertRestaurant(Restaurant restaurant);
	
	Restaurant getRestaurantByRestaurantName(String restaurantname);
	
	List<Restaurant> viewRestaurant();

}
