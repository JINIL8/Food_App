package com.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantController {

	@RequestMapping("/add-restaurant")
	public String getAddUserPage() {
		return "Restaurant//addRestaurant";
	}
	
	/*
	 * @RequestMapping("/restaurant/details/{restaurantId}") public String
	 * getDetailRestaurantyPage(ModelMap map, @PathVariable("restaurantId") String
	 * restaurantId) { map.addAttribute("restaurantId", restaurantId); return
	 * "Restaurant//addRestaurant";; }
	 */
	/*
	 * @RequestMapping("/edit-user/{userId}") public String getEditUserPage(ModelMap
	 * map, @PathVariable("userId") String userId) { map.addAttribute("userId",
	 * userId); return "users//editUser"; }
	 * 
	 *
	 */

	@RequestMapping("/restaurant-list")
	public String getUserListPage() {
		return "Restaurant//restaurantList";
	}
}
