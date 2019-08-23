package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.UserRepository;
import com.app.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteUser(id);
	}

	@Override
	public User getUserByEmail(String email) {
		return userRepository.getUserByEmail(email);
	}

	@Override
	public User getUserById(Integer id) {
		return userRepository.getUserById(id);
	}

	@Override
	public void insertUser(User user) {
		userRepository.insertUser(user);
	}

	@Override
	public List<User> viewUser() {
		return userRepository.viewUser();
	}

	@Override
	public User getUserByUserName(String username) {
		return userRepository.getUserByUserName(username);
	}

}
