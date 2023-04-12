package com.example.demo.Service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.Entity.Laptop;
import com.example.demo.Repositoty.LaptopRepository;

@Service

public class LaptopServiceImpl implements LaptopService {
	
	@Autowired LaptopRepository laptopRepository;

	@Override
	public Laptop getLaptop(int laptopId) {
	
		return laptopRepository.findById(laptopId).get();
	}

	

}
