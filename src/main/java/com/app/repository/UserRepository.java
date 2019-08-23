package com.app.repository;

import java.util.List;

import com.app.entity.User;

public interface UserRepository {

	void deleteUser(Integer id);

	User getUserByEmail(String email);

	User getUserById(Integer id);
	
	User getUserByUserName(String username);

	void insertUser(User user);

	List<User> viewUser();

}
