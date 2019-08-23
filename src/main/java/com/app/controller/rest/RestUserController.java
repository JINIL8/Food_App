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

import com.app.bo.UserBO;
import com.app.Constants.AppConstant;
import com.app.entity.User;
import com.app.entity.rest.RestUser;

@RestController
public class RestUserController {

	@Autowired
	UserBO userBO;

	/*
	 * @RequestMapping(value = { "change-user-password" }, method =
	 * RequestMethod.POST, headers = "Accept=application/json") public
	 * ResponseEntity<Object> changePassword(@RequestBody RestPassword rPassword) {
	 * 
	 * Map<String, Object> data = new HashMap<>();
	 * 
	 * User user = userBO.getUserById(rPassword.getUid()); if (user != null) {
	 * 
	 * if (user.getPassword().equalsIgnoreCase(rPassword.getOld_password())) {
	 * user.setPassword(rPassword.getNew_password()); userBO.insertUser(user);
	 * data.put(AppConstant.STR_RESPONSE, AppConstant.STR_TRUE);
	 * data.put(AppConstant.STR_MESSAGE, "Password Changed"); } else {
	 * 
	 * data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
	 * data.put(AppConstant.STR_MESSAGE, "Old Password is incorrect"); } } else {
	 * data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
	 * data.put(AppConstant.STR_MESSAGE, AppConstant.DATA_IS_NOT_VALID); } return
	 * ResponseEntity.ok(data);
	 * 
	 * }
	 */

	/*
	 * @RequestMapping(value = { "delete-user" }, method = RequestMethod.POST,
	 * headers = "Accept=application/json") public ResponseEntity<Object>
	 * deleteUser(@RequestBody User user, HttpSession session) {
	 * 
	 * Map<String, Object> data = new HashMap<>();
	 * 
	 * if (user.getId() == 0) { data.put(AppConstant.STR_RESPONSE,
	 * AppConstant.STR_FALSE); data.put(AppConstant.STR_MESSAGE,
	 * AppConstant.DATA_IS_NOT_VALID); return ResponseEntity.ok(data); }
	 * 
	 * userBO.deleteUser(user.getId());
	 * 
	 * session.setAttribute("success-message", "User Deleted Successfully");
	 * session.setAttribute("user-created", "success");
	 * 
	 * data.put(AppConstant.STR_MESSAGE, "User Deleted Successfully");
	 * data.put(AppConstant.STR_RESPONSE, AppConstant.STR_TRUE);
	 * 
	 * return ResponseEntity.ok(data);
	 * 
	 * }
	 */

	@RequestMapping(value = { "user/details" }, method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> getUserById(@RequestBody User user) {

		Map<String, Object> data = new HashMap<>();

		if (user.getId() == 0) {
			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, AppConstant.DATA_IS_NOT_VALID);
			return ResponseEntity.ok(data);
		}

		User userdetail = userBO.getUserById(user.getId());

		data.put("userdetail", userdetail);
		data.put(AppConstant.STR_RESPONSE, AppConstant.STR_TRUE);

		return ResponseEntity.ok(data);

	}

	/*
	 * @RequestMapping(value = { "userlist" }, method = RequestMethod.POST, headers
	 * = "Accept=application/json") public ResponseEntity<Object>
	 * getUserList(@RequestBody User user) {
	 * 
	 * Map<String, Object> data = new HashMap<>();
	 * 
	 * data.put("userlist", userBO.viewUser()); data.put(AppConstant.STR_RESPONSE,
	 * AppConstant.STR_TRUE);
	 * 
	 * return ResponseEntity.ok(data);
	 * 
	 * }
	 */

	/*
	 * @RequestMapping(value = { "user/login" }, method = RequestMethod.POST,
	 * headers = "Accept=application/json") public ResponseEntity<Object>
	 * loginUserByEmail(@RequestBody RestUser user) {
	 * 
	 * Map<String, Object> data = new HashMap<>();
	 * 
	 * if (user.getEmail_id() == null && user.getEmail_id().equalsIgnoreCase("")) {
	 * data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
	 * data.put(AppConstant.STR_MESSAGE, AppConstant.DATA_IS_NOT_VALID); return
	 * ResponseEntity.ok(data); }
	 * 
	 * User userObj = userBO.getUserByEmail(user.getEmail_id());
	 * 
	 * if (!userObj.getPassword().equalsIgnoreCase(user.getPassword())) {
	 * data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
	 * data.put(AppConstant.STR_MESSAGE, "Password Invalid"); return
	 * ResponseEntity.ok(data); }
	 * 
	 * data.put("loggeduser", userObj); data.put(AppConstant.STR_RESPONSE,
	 * AppConstant.STR_TRUE);
	 * 
	 * return ResponseEntity.ok(data);
	 * 
	 * }
	 */
	
	@RequestMapping(value = { "user/login" }, method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> loginByUserName(@RequestBody RestUser user) {

		Map<String, Object> data = new HashMap<>();

		if (user.getUsername() == null || user.getUsername().equalsIgnoreCase("")) {
			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, AppConstant.DATA_IS_NOT_VALID);
			data.put(AppConstant.STR_MESSAGE, "UserName is not valid ");
			return ResponseEntity.ok(data);
		}

		User userObj = userBO.getUserByUserName(user.getUsername());
		if(userObj == null) {
			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, "UserName is not valid ");
			return ResponseEntity.ok(data);
	
		}
		if (!userObj.getPassword().equalsIgnoreCase(user.getPassword())) {
			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, "Password Invalid");
			return ResponseEntity.ok(data);
		}
		
		data.put("loggeduser", userObj);
		data.put(AppConstant.STR_RESPONSE, AppConstant.STR_TRUE);
		data.put(AppConstant.STR_MESSAGE, "User Logged Successfully");

		return ResponseEntity.ok(data);

	}
	@RequestMapping(value = { "user/register" }, method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> saveUser(@RequestBody RestUser user, HttpSession session) {

		Map<String, Object> data = new HashMap<>();

		if (user.getName() == null && user.getName().equalsIgnoreCase("")) {
			data.put(AppConstant.STR_RESPONSE, AppConstant.STR_FALSE);
			data.put(AppConstant.STR_MESSAGE, AppConstant.DATA_IS_NOT_VALID);
			return ResponseEntity.ok(data);
		}

		System.out.println("User Name : " + user.getName());
		System.out.println("User Email : " + user.getEmail_id());

		User userObj;

		if (user.getUserid() > 0 && user.getUserid() != 0) {
			userObj = userBO.getUserById(user.getUserid());
		} else {
			
			userObj = new User();
		}
		userObj.setName(user.getName());
		userObj.setMobilenumber(user.getMobilenumber());
		userObj.setEmail_id(user.getEmail_id());
		userObj.setPassword(user.getPassword());
		userObj.setAddress(user.getAddress());

		userBO.insertUser(userObj);

		data.put(AppConstant.STR_MESSAGE, "User Created Successfully");
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