package com.app.entity.rest;

public class RestRestaurant {
	private int restaurant_id;
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

	public String getRestaurantname() {
		return restaurantname;
	}

	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}

	public String getPassword() {
		return password;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
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
