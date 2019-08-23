package com.app.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.service.RestaurantService;
import com.app.entity.Restaurant;

@Component
public class RestaurantBO {

	@Autowired
	RestaurantService restaurantService;

	public void deleteRestaurant(Integer id) {
		restaurantService.deleteRestaurant(id);
	}

	public Restaurant getRestaurantByEmail(String email) {
		return restaurantService.getRestaurantByEmail(email);
	}

	public Restaurant getRestaurantById(Integer id) {
		return restaurantService.getRestaurantById(id);
	}

	public void insertRestaurant(Restaurant restaurant) {
		restaurantService.insertRestaurant(restaurant);
	}

	public List<Restaurant> viewRestaurant() {
		return restaurantService.viewRestaurant();
	}
	public Restaurant getRestaurantByRestaurantName(String restaurantname) {
		return restaurantService.getRestaurantByRestaurantName(restaurantname);
	}


}
