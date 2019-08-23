package com.app.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TBL_FOOD_DISHCATEGORY")
public class DishCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "restaurant_id")
	@Fetch(FetchMode.JOIN)
	@JsonIgnore
	private Restaurant restaurantDishCategory;

	@OneToMany(mappedBy = "dishcategory", fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<Dishes> dishes;

	public Restaurant getRestaurantDishCategory() {
		return restaurantDishCategory;
	}

	public void setRestaurantDishCategory(Restaurant restaurantDishCategory) {
		this.restaurantDishCategory = restaurantDishCategory;
	}

	public Set<Dishes> getDishes() {
		return dishes;
	}

	public void setDishes(Set<Dishes> dishes) {
		this.dishes = dishes;
	}

	private String name;

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

}
