package com.app.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TBL_FOOD_RESTAURANT")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(mappedBy = "dishesrestaurant", fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<Dishes> dishes;

	@OneToMany(mappedBy = "restaurantDishCategory", fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<DishCategory> dishcategory;
	private boolean isveg;
	private String name;
	
	private String opentiming;

	private String closetiming;
	private String cusines;
	private String email_id;
	private String mobileno;
	private String packing_charges;
	private String homedelivery_charges;
	private String rating;
	private String password;
	private String address;
	private String restaurantname;

	public Set<Dishes> getDishes() {
		return dishes;
	}

	public String getRestaurantname() {
		return restaurantname;
	}

	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}

	public void setDishes(Set<Dishes> dishes) {
		this.dishes = dishes;
	}

	public Set<DishCategory> getDishcategory() {
		return dishcategory;
	}

	public void setDishcategory(Set<DishCategory> dishcategory) {
		this.dishcategory = dishcategory;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isIsveg() {
		return isveg;
	}

	public void setIsveg(boolean isveg) {
		this.isveg = isveg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getOpentiming() {
		return opentiming;
	}

	public void setOpentiming(String opentiming) {
		this.opentiming = opentiming;
	}

	public String getClosetiming() {
		return closetiming;
	}

	public void setClosetiming(String closetiming) {
		this.closetiming = closetiming;
	}

	public String getCusines() {
		return cusines;
	}

	public void setCusines(String cusines) {
		this.cusines = cusines;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getPacking_charges() {
		return packing_charges;
	}

	public void setPacking_charges(String packing_charges) {
		this.packing_charges = packing_charges;
	}

	public String getHomedelivery_charges() {
		return homedelivery_charges;
	}

	public void setHomedelivery_charges(String homedelivery_charges) {
		this.homedelivery_charges = homedelivery_charges;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}
