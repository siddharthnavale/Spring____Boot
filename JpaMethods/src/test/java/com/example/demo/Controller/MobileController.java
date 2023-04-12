package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	
	

}
