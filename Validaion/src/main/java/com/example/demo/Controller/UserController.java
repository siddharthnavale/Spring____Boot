package com.example.demo.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Mobile;
import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	 private UserService userService; 
	
	@PostMapping("/users")
	public ResponseEntity<String> addUser(@Valid @RequestBody User user){
		userService.addUser(user);
		return ResponseEntity.ok("User is valid");
	
	}
	
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable int userId ){
		
		return this.userService.getUser(userId);
		
	}
	
	
	

}
