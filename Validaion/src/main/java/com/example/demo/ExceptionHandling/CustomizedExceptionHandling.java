package com.example.demo.ExceptionHandling;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CustomizedExceptionHandling extends ResponseEntityExceptionHandler {
    
	
	 @ExceptionHandler(NoSuchElementException.class)
	    public ResponseEntity<Object> handleExceptions( NoSuchElementException exception, WebRequest webRequest) {
	        ExceptionResponse response = new ExceptionResponse();
	        response.setDateTime(LocalDateTime.now());
	        response.setMessage("Not found");
	        ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	        return entity;
	    }
	 
	 @ExceptionHandler(UserNotFoundException.class)
	 public ResponseEntity<ExceptionResponse> userNotFoundExceptionHandler(UserNotFoundException ex){
		
		 String Massage=ex.getMessage();
		 boolean isFoundRecord= false;
		 LocalDateTime now=LocalDateTime.now(); 
		 ExceptionResponse exceptionResponse = new ExceptionResponse(Massage, isFoundRecord, now); 
		 return new ResponseEntity<ExceptionResponse>(exceptionResponse,HttpStatus.NOT_FOUND);
		 
	 }
}
