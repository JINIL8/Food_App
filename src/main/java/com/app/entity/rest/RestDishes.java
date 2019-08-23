package com.app.entity.rest;

public class RestDishes {
	private int dishes_id;
	private String name;
	private String price;
	private String discount;
	private boolean isspecial;
	private int restaurant_id;
	private int dishcategory_id;

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

	public int getDishes_id() {
		return dishes_id;
	}

	public void setDishes_id(int dishes_id) {
		this.dishes_id = dishes_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public boolean isIsspecial() {
		return isspecial;
	}

	public void setIsspecial(boolean isspecial) {
		this.isspecial = isspecial;
	}
}
