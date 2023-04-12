package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Mobile;
import com.example.demo.Service.MobileService;

@RestController
public class MobileController {
	
	@Autowired
	MobileService mobileService;
	
	@GetMapping("/mobiles")
	public List<Mobile> getMobile(){
		
		return this.mobileService.getAllMobiles();
		
	}
	
	@GetMapping("/mobiles/{mobileId}")
	public Mobile getMobile(@PathVariable int mobileId ){
		
		return this.mobileService.getMobile(mobileId);
		
	}
	
	@PostMapping ("/mobiles")
	public Mobile addMobile (@RequestBody Mobile mobile ) {
		
		return this.mobileService.addMoblie(mobile);
	
	}
	
	@DeleteMapping("/mobiles/{mobileId}")
	public Mobile deleteMobile (@PathVariable int mobileId ) {
		
		return this.mobileService.deleteMobile(mobileId);
		
	}
	
	@GetMapping("/mobilesByModelName/{mobileModel}")
     public List<Mobile> getMobilesByModelName(@PathVariable String mobileModel ){
		
		return this.mobileService.getMobilesByModelName(mobileModel);
		
	}	
	
	@GetMapping("/findByPriceLessThan/{price}")
    public List<Mobile> getByPriceLessThan(@PathVariable int price ){
		
		return this.mobileService.getByPriceLessThan(price);
		
	}
	
	@GetMapping("/getByHardDiskGreaterThan/{hardDisk}")
    public List<Mobile> getByHardDiskGreaterThan(@PathVariable int hardDisk ){
		
		return this.mobileService.getByHardDiskGreaterThan(hardDisk);
		
	}
	
	@GetMapping("/findMobileBypriceAndhardDisk/{price}/{hardDisk}")
    public List<Mobile> getMobileBypriceAndHardDisk(@PathVariable int price,@PathVariable int hardDisk){
		
		return this.mobileService.getMobileBypriceAndHardDisk(price,hardDisk);
		
	}
	
	@GetMapping("/getByRam/{ram}")
    public List<Mobile> getByRam(@PathVariable int ram){
		
		return this.mobileService.getByRam(ram);
		
	}
	
	@GetMapping("/getAll")
	public List<Mobile> getAll(){
		
		return this.mobileService.getAll();
		
	}
	
	@GetMapping("/getAllBasedOnLength")
	public List<Mobile> getAllBasedOnLength(){
		
		return this.mobileService.getAllBasedOnLength();
		
	
		
	}
	

}
