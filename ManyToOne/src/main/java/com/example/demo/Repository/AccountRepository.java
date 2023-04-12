package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

	@Query("from Account a where a.accountNumber=:a")
	public Account getAccountDetailsByAccountNumber(@Param ("a") int accountNumber);
	
	
}
