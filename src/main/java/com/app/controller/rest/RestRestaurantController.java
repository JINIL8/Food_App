package com.app.controller.rest;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.bo.RestaurantBO;
import com.app.bo.UserBO;
import com.app.entity.Restaurant;
import com.app.entity.User;
import com.app.entity.rest.RestRestaurant;
import com.app.entity.rest.RestUser;
import com.app.Constants.AppConstant;

@RestController
public class RestRestaurantController {

	@Autowired
	RestaurantBO restaurantBO;

	@RequestMapping(value = { "restaurant-delete" }, method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> deleteRestaurant(@RequestBody Restaurant restaurant, HttpSession session) {

		Map<String, Object> data = new HashMap<>();

		if (restaurant.getId() == 0) {
			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, AppConstant.DATA_IS_NOT_VALID);
			return ResponseEntity.ok(data);
		}

		restaurantBO.deleteRestaurant(restaurant.getId());

		session.setAttribute("success-message", "Restaurant Deleted Successfully");
		session.setAttribute("restaurant-created", "success");

		data.put(AppConstant.STR_MESSAGE, "Restaurant Deleted Successfully");
		data.put(AppConstant.STR_RESPONSE, AppConstant.STR_TRUE);

		return ResponseEntity.ok(data);

	}

	@RequestMapping(value = { "restaurant/details" }, method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> getRestaurantById(@RequestBody Restaurant restaurant) {

		Map<String, Object> data = new HashMap<>();

		if (restaurant.getId() == 0) {
			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, AppConstant.DATA_IS_NOT_VALID);
			return ResponseEntity.ok(data);
		}

		Restaurant restaurantdetail = restaurantBO.getRestaurantById(restaurant.getId());

		data.put("restaurantdetail", restaurantdetail);
		data.put(AppConstant.STR_RESPONSE, AppConstant.STR_TRUE);

		return ResponseEntity.ok(data);

	}

	@RequestMapping(value = { "restaurant-list" }, method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> getRestaurantList(@RequestBody Restaurant restaurant) {

		Map<String, Object> data = new HashMap<>();

		data.put("restaurantlist", restaurantBO.viewRestaurant());
		data.put(AppConstant.STR_RESPONSE, AppConstant.STR_TRUE);

		return ResponseEntity.ok(data);

	}

	@RequestMapping(value = { "restaurant-login" }, method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> loginByRestaurantName(@RequestBody RestRestaurant restaurant) {

		Map<String, Object> data = new HashMap<>();

		if (restaurant.getRestaurantname() == null || restaurant.getRestaurantname().equalsIgnoreCase("")) {
			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, AppConstant.DATA_IS_NOT_VALID);
			data.put(AppConstant.STR_MESSAGE, "RestaurantName is not valid ");
			return ResponseEntity.ok(data);
		}

		Restaurant restaurantObj = restaurantBO.getRestaurantByRestaurantName(restaurant.getRestaurantname());
		if(restaurantObj == null) {
			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, "RestaurantName is not valid ");
			return ResponseEntity.ok(data);
	
		}
		if (!restaurantObj.getPassword().equalsIgnoreCase(restaurant.getPassword())) {
			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, "Password Invalid");
			return ResponseEntity.ok(data);
		}
		
		data.put("loggedrestaurant", restaurantObj);
		data.put(AppConstant.STR_RESPONSE, AppConstant.STR_TRUE);
		data.put(AppConstant.STR_MESSAGE, "Restaurant Logged Successfully");

		return ResponseEntity.ok(data);

	}

	@RequestMapping(value = { "restaurant/save" }, method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> saveRestaurant(@RequestBody RestRestaurant restaurant, HttpSession session) throws ParseException {

		Map<String, Object> data = new HashMap<>();
 
		if (restaurant.getName() == null && restaurant.getName().equalsIgnoreCase("")) {
			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, AppConstant.DATA_IS_NOT_VALID);
			return ResponseEntity.ok(data);
		}

		Restaurant restaurantObj;

		if (restaurant. getRestaurant_id() > 0 && restaurant.getRestaurant_id() != 0) {
			restaurantObj = restaurantBO.getRestaurantById(restaurant.getRestaurant_id());
		} else {
			restaurantObj = new Restaurant();
		}
		restaurantObj.setName(restaurant.getName());
		restaurantObj.setMobileno(restaurant.getMobileno());
		restaurantObj.setEmail_id(restaurant.getEmail_id());
		restaurantObj.setPassword(restaurant.getPassword());
		restaurantObj.setAddress(restaurant.getAddress());
		
		restaurantObj.setClosetiming(restaurant.getClosetiming());
		restaurantObj.setCusines(restaurant.getCusines());
		restaurantObj.setHomedelivery_charges(restaurant.getHomedelivery_charges());
		restaurantObj.setOpentiming(restaurant.getOpentiming());
		restaurantObj.setIsveg(restaurant.isIsveg());
		restaurantObj.setPacking_charges(restaurant.getPacking_charges());
		restaurantObj.setRating(restaurant.getRating());
		
		restaurantBO.insertRestaurant(restaurantObj);

		data.put(AppConstant.STR_MESSAGE, "Restaurant Created Successfully");
		data.put(AppConstant.STR_RESPONSE, AppConstant.STR_TRUE);

		return ResponseEntity.ok(data);
	}

	/*
	 * @RequestMapping(value = { "upload-user-image" }, method = RequestMethod.POST,
	 * consumes = "multipart/form-data") public ResponseEntity<Object>
	 * uploadPhotoPdf(@RequestPart("profile_image") MultipartFile photoidfile,
	 * 
	 * @RequestParam("userid") Integer userid, HttpServletRequest request) throws
	 * IOException {
	 * 
	 * Map<String, Object> data = new HashMap<>();
	 * 
	 * User productObj = userBO.getUserById(userid);
	 * 
	 * if (productObj == null) { data.put(AppConstant.STR_RESPONSE,
	 * AppConstant.STR_FALSE); data.put(AppConstant.STR_MESSAGE,
	 * "Data is not valid."); return ResponseEntity.ok(data); }
	 * 
	 * String fileName = "", ext = ""; String Folder =
	 * "/home/disha/Downloads/CorporateAdminWebsite/src/main/resources/static/assets/image/user/";
	 * String imagepath = "/resources/assets/image/user/";
	 * 
	 * if (photoidfile.isEmpty()) {
	 * System.out.println("Please select a file to upload"); } else {
	 * 
	 * fileName = photoidfile.getOriginalFilename(); int i =
	 * fileName.lastIndexOf(".");
	 * 
	 * if (i > 0) { ext = fileName.substring(i + 1); }
	 * 
	 * fileName = "" + System.currentTimeMillis() + "." + ext;
	 * photoidfile.transferTo(new File(Folder + fileName));
	 * 
	 * }
	 * 
	 * System.out.println(Folder + fileName); productObj.setProfile_image(imagepath
	 * + fileName); userBO.insertUser(productObj);
	 * 
	 * data.put(AppConstant.STR_RESPONSE, AppConstant.STR_TRUE);
	 * data.put(AppConstant.STR_MESSAGE, "File Uploaded Successfully");
	 * 
	 * return ResponseEntity.ok(data);
	 * 
	 * }
	 */

	/*
	 * @RequestMapping("/sendMail") public String sendMail() { final String username
	 * = "sonijinil984@gmail.com"; final String password = "JinilSoni878";
	 * Properties props = new Properties(); props.put("mail.smtp.auth", "true");
	 * props.put("mail.smtp.starttls.enable", "true");
	 * props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	 * props.put("mail.smtp.host", "smtp.gmail.com"); props.put("mail.smtp.port",
	 * "587");
	 *
	 * Session session = Session.getInstance(props, new javax.mail.Authenticator() {
	 *
	 * @Override protected PasswordAuthentication getPasswordAuthentication() {
	 * return new PasswordAuthentication(username, password); } });
	 *
	 * try {
	 *
	 * Message message = new MimeMessage(session); message.setFrom(new
	 * InternetAddress("sonijinil984@gmail.com"));
	 * message.setRecipients(Message.RecipientType.TO,
	 * InternetAddress.parse("sonijinil9841@gmail.com"));
	 * message.setSubject("Java Mailer");
	 * message.setText("Hello this mail is sent from java code");
	 *
	 * Transport.send(message);
	 *
	 * } catch (MessagingException e) { throw new RuntimeException(e); } return
	 * "Mail send your email Id "; }
	 */
}