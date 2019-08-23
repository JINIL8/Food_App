package com.app.security;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.bo.UserBO;
import com.app.entity.User;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	HttpSession session;

	@Autowired
	private UserBO userBO;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		User user = userBO.getUserByEmail(email);
		if (user == null) {
			throw new UsernameNotFoundException("User 404");
		}

		session.setAttribute("sessionUserId", user.getId());

		return new UserPrincipal(user);
	}

}