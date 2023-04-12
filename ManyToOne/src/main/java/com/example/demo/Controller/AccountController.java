package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Account;
import com.example.demo.Service.AccountService;


@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/getAccountDetailsByAccountNumber/{accountNumber}")
	public Account findAccountDetailsByAccountNumber(@PathVariable int accountNumber) {
		return accountService.getAccountDetailsByAccountNumber(accountNumber);
	}
	//Now we can test the response on our controller and see that the branch 
	//object also comes as part of the response.

}
