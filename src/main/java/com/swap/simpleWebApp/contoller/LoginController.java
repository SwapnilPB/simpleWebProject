package com.swap.simpleWebApp.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping("/login")
	public String login() {
		return "You have login Ayansh!!!";
	}
}
