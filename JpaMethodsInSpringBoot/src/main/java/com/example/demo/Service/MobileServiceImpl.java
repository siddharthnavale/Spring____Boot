package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Mobile;
import com.example.demo.Repositoty.MobileRepository;

@Service
public class MobileServiceImpl implements MobileService {
	
    @Autowired
	private MobileRepository mobileRepository;
	
  //Derived Query With sort getAllMobiles()
    @Override
	public List<Mobile> getAllMobiles() {
	
		return this.mobileRepository.findAll(Sort.by(Sort.Direction.DESC, "price"));
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

	@Override
	public List<Mobile> getMobilesByModelName(String mobileModel) {
		return this.mobileRepository.findByMobileModelContaining(mobileModel);
	}

	@Override
	public List<Mobile> getByPriceLessThan(int price) {
		return this.mobileRepository.findByPriceLessThan(price);
	}

	@Override
	public List<Mobile> getByHardDiskGreaterThan(int hardDisk) {

		return this.mobileRepository.findByHardDiskGreaterThan(hardDisk);
	}

	@Override
	public List<Mobile> getMobileBypriceAndHardDisk(int price, int hardDisk) {
		
		return this.mobileRepository.findMobileBypriceAndhardDisk(price, hardDisk);
	}

	@Override
	public List<Mobile> getByRam(int ram) {
	
		return this.mobileRepository.findByRam(ram);
		
	}

	@Override
	public List<Mobile> getAll() {
		return this.mobileRepository.getAll(Sort.by("ram"));
	}



	@Override
	public List<Mobile> getAllBasedOnLength() {
	
		return this.mobileRepository.getAll(JpaSort.unsafe("LENGTH(mobileModel)"));
	}

	



	

}
