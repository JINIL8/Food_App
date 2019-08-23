package com.app.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWelcomeController {

	@RequestMapping("/welcome/rest")
	public String getWelcomePage() {
		return "Hello This Is A Rest Welcome Page";
	}

}
