package com.example.Tourism_Management_Portal.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	
	@GetMapping("/loginMessage")
	public String loginMessage()
	{
		return "STARTING PAGE";
	}
	
	
	@GetMapping("/welcome")
	public String welcomeMessage()
	{
		return "WELCOME PAGE";
	}
}
