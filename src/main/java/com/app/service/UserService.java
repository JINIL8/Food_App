package com.app.service;

import java.util.List;

import com.app.entity.User;

public interface UserService {

	void deleteUser(Integer id);

	User getUserByEmail(String email);

	User getUserById(Integer id);

	void insertUser(User user);

	User getUserByUserName(String username);

	List<User> viewUser();

}
