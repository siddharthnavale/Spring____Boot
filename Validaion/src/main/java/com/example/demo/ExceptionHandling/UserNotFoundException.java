package com.example.demo.ExceptionHandling;

public class UserNotFoundException extends RuntimeException{

	String name;
	int fieldValue;
	String fieldName;
	
	public UserNotFoundException(String name, int fieldValue, String fieldName) {
		super(String.format("%s not found with %s : %d",name,fieldName,fieldValue));
		this.name = name;
		this.fieldValue = fieldValue;
		this.fieldName = fieldName;
	}
	
	
}
