package com.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/blank")
	public String getBlankPage() {
		return "welcome//blank-page";
	}

	@RequestMapping("/welcome")
	public String getWelcomePage() {
		return "welcome//welcome-page";
	}

	/*
	 * @RequestMapping("/login") public String getWelcomeString() { return
	 * "security//login"; }
	 * 
	 * @RequestMapping("/myProfile") public String myProfilePage() { return
	 * "users//myProfile"; }
	 * 
	 * @RequestMapping("/reset") public String resetPassword() { return
	 * "security//resetpassword"; }
	 */
}
