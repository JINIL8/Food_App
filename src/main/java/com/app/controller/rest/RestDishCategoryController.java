package com.app.controller.rest;

import java.io.File;
import java.io.IOException;
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

import com.app.bo.DishCategoryBO;
import com.app.bo.RestaurantBO;
import com.app.bo.UserBO;
import com.app.entity.DishCategory;
import com.app.entity.Restaurant;
import com.app.entity.rest.RestDishCategory;
import com.app.Constants.AppConstant;

@RestController
public class RestDishCategoryController {

	@Autowired
	DishCategoryBO dishcategoryBO;

	@Autowired
	RestaurantBO restaurantBO;

	@RequestMapping(value = { "delete-dishcategory" }, method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> deleteDishCategory(@RequestBody DishCategory dishcategory, HttpSession session) {

		Map<String, Object> data = new HashMap<>();

		if (dishcategory.getId() == 0) {
			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, AppConstant.DATA_IS_NOT_VALID);
			return ResponseEntity.ok(data);
		}

		dishcategoryBO.deleteDishCategory(dishcategory.getId());

		session.setAttribute("success-message", "DishCategory Deleted Successfully");
		session.setAttribute("dishcategory-created", "success");

		data.put(AppConstant.STR_MESSAGE, "DishCategory Deleted Successfully");
		data.put(AppConstant.STR_RESPONSE, AppConstant.STR_TRUE);

		return ResponseEntity.ok(data);

	}

	@RequestMapping(value = {
			"dishcategory-details" }, method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> getDishCategoryById(@RequestBody DishCategory dishcategory) {

		Map<String, Object> data = new HashMap<>();

		if (dishcategory.getId() == 0) {
			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, AppConstant.DATA_IS_NOT_VALID);
			return ResponseEntity.ok(data);
		}

		DishCategory dishcategorydetail = dishcategoryBO.getDishCategoryById(dishcategory.getId());

		data.put("dishcategorydetail", dishcategorydetail);
		data.put(AppConstant.STR_RESPONSE, AppConstant.STR_TRUE);

		return ResponseEntity.ok(data);

	}

	@RequestMapping(value = { "dishcategorylist" }, method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> getDishCategoryList(@RequestBody DishCategory dishcategory) {

		Map<String, Object> data = new HashMap<>();

		data.put("dishcategorylist", dishcategoryBO.viewDishCategory());
		data.put(AppConstant.STR_RESPONSE, AppConstant.STR_TRUE);

		return ResponseEntity.ok(data);

	}

	@RequestMapping(value = { "dishcategory/save" }, method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> saveDishCategory(@RequestBody RestDishCategory dishcategory, HttpSession session) {

		Map<String, Object> data = new HashMap<>();

		if (dishcategory.getName() == null || dishcategory.getName().equalsIgnoreCase("")) {

			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, AppConstant.DATA_IS_NOT_VALID);
			return ResponseEntity.ok(data);
		}

		DishCategory dishcategoryObj;

		Restaurant restaurant = restaurantBO.getRestaurantById(dishcategory.getRestaurant_id());
		if (restaurant == null) {

			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, AppConstant.DATA_IS_NOT_VALID + " ,Restaurant id is invalid");
			return ResponseEntity.ok(data);
		}

		if (dishcategory.getDishcategory_id() > 0 && dishcategory.getDishcategory_id() != 0) {
			dishcategoryObj = dishcategoryBO.getDishCategoryById(dishcategory.getDishcategory_id());
		} else {
			dishcategoryObj = new DishCategory();
		}
		dishcategoryObj.setName(dishcategory.getName());
		dishcategoryObj.setRestaurantDishCategory(restaurant);
		dishcategoryBO.insertDishCategory(dishcategoryObj);

		data.put(AppConstant.STR_MESSAGE, "DishCategory Created Successfully");
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