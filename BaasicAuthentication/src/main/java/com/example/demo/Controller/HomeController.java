package com.example.demo.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		
		return "This is Home Page"; 
	}
	
 //@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/login")
	public String login() {
		
		return "This is Login Page"; 
	}
	
	@GetMapping("/register")
	public String register() {
		
		return "This is Register Page"; 
	}

}
