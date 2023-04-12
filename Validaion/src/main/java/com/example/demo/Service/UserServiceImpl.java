package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.User;
import com.example.demo.ExceptionHandling.UserNotFoundException;
import com.example.demo.Repositoty.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository  UserRepository;
	
	@Override
	public void addUser(User user) {
	
		UserRepository.save(user);
		
	}

	@Override
	public User getUser(int userId) {
		
	return UserRepository.findById(userId).orElseThrow(()->new UserNotFoundException("user",userId,"Id"));
	}

}
