package com.example.demo.Controller;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Laptop;
import com.example.demo.Entity.Mobile;
import com.example.demo.Service.LaptopService;

@RestController
@Validated //we have to added Spring’s @Validated annotation to the controller at class level
//to tell Spring to evaluate the constraint annotations on method parameters.
public class LaptopController {
	
	
	@Autowired
	private LaptopService laptopService;
	//Instead of annotating a class field like above, we’re adding a constraint 
//annotation (in this case @Min) directly to the method parameter in the Spring controller
	@GetMapping("/laptops/{laptopId}")
	public Laptop getLaptop(@PathVariable("laptopId") @Min(5) int laptopId ){
		
		return this.laptopService.getLaptop(laptopId);
//In contrast to request body validation a failed validation will trigger
//a ConstraintViolationException instead of a MethodArgumentNotValidException.
//If we want to return a HTTP status 400 instead (which makes sense, since the 
//client provided an invalid parameter, making it a bad request), we can add a 
//custom exception handler to our controller
	}	
		
		
		
	}
	
	

