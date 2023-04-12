package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.Entity.Mobile;
import com.example.demo.Repositoty.MobileRepository;

@Service
@Validated
//Instead of (or additionally to) validating input on the controller level, 
//we can also validate the input to any Spring components
//In order to to this, we use a combination of the @Validated and @Valid annotations
//Again, the @Validated annotation is only evaluated on class level, so don’t put it 
//on a method in this use case.
public class MobileServiceImpl implements MobileService {
	
    @Autowired
	private MobileRepository mobileRepository;
	
    @Override
	public List<Mobile> getAllMobiles() {
	
		return this.mobileRepository.findAll();
	}

	@Override
	public Mobile getMobile(int mobileId) {
		
		return this.mobileRepository.findById(mobileId).get();
	}

	@Override
	public Mobile addMoblie(Mobile mobile) {
		
		return this.mobileRepository.save(mobile);
	}

	@Override
	public Mobile deleteMobile(int mobileId) {
		
		Mobile mobile= this.mobileRepository.findById(mobileId).get();
	   this.mobileRepository.delete(mobile);
	   return mobile;
	}



	

}
