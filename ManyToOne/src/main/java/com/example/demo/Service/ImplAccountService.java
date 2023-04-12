package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Account;
import com.example.demo.Repository.AccountRepository;

@Service
public class ImplAccountService implements AccountService{

	
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Account getAccountDetailsByAccountNumber(int accountNumber) {
	
		return accountRepository.getAccountDetailsByAccountNumber(accountNumber);
	}

}
