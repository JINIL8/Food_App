package com.app.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.service.UserService;
import com.app.entity.User;

@Component
public class UserBO {

	@Autowired
	UserService userService;   

	public void deleteUser(Integer id) {
		userService.deleteUser(id);
	}

	public User getUserByEmail(String email) {
		return userService.getUserByEmail(email);
	}

	public User getUserById(Integer id) {
		return userService.getUserById(id);
	}

	public void insertUser(User user) {
		userService.insertUser(user);
	}

	public List<User> viewUser() {
		return userService.viewUser();
	}

	public User getUserByUserName(String username) {
		return userService.getUserByUserName(username);
	}
}
