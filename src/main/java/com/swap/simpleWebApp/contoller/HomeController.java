package com.swap.simpleWebApp.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String greet() {
		return "Welcome Ayansh!!!";
	}


	@RequestMapping("/about")
	public String about() {
		return "Ayansh is very smart boy!!!";
	}
}
