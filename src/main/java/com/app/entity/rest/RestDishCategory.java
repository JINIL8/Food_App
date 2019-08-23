package com.app.entity.rest;

public class RestDishCategory {

	private int dishcategory_id;
	private String name;
	private int restaurant_id;
	
	public int getRestaurant_id() {
		return restaurant_id;
	}
	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	public int getDishcategory_id() {
		return dishcategory_id;
	}
	public void setDishcategory_id(int dishcategory_id) {
		this.dishcategory_id = dishcategory_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
