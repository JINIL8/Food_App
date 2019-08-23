package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TBL_FOOD_DISHES")
public class Dishes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "restaurant_id")
	@Fetch(FetchMode.JOIN)
	@JsonIgnore
	private Restaurant dishesrestaurant;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dishcategory_id")
	@Fetch(FetchMode.JOIN)
	@JsonIgnore
	private DishCategory dishcategory;

	private String name;
	private String price;
	private String discount;
	private boolean isspecial;

	public DishCategory getDishcategory() {
		return dishcategory;
	}

	public Restaurant getDishesrestaurant() {
		return dishesrestaurant;
	}

	public void setDishesrestaurant(Restaurant dishesrestaurant) {
		this.dishesrestaurant = dishesrestaurant;
	}

	public void setDishcategory(DishCategory dishcategory) {
		this.dishcategory = dishcategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
