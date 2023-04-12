package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Mobile;
import com.example.demo.Service.MobileService;

@RestController
public class MobileController {
	
	@Autowired
	private MobileService mobileService;
	
	//pagination with default method 
	@GetMapping("/mobiles")
	public List<Mobile> getAllByPage(
		@RequestParam(value="pageNumber",defaultValue="0",required=false) Integer pageNumber,
		@RequestParam(value="pageSize",defaultValue="1",required=false) Integer pageSize){
		return this.mobileService.getAllByPage(pageNumber,pageSize);	
	}
	
	//pagination with JPQL Queries
	@GetMapping("/mobilesThroughJpql")
	public List<Mobile> getAllByPageJpql(
			@RequestParam(value="pageNumber",defaultValue="0",required=false) Integer pageNumber,
			@RequestParam(value="pageSize",defaultValue="1",required=false) Integer pageSize){
			return this.mobileService.getAllByPageJpql(pageNumber,pageSize);	
		}
	
	//pagination with Native Queries
		@GetMapping("/mobilesThroughNative")
		public List<Mobile> getAllByPageNative(
				@RequestParam(value="pageNumber",defaultValue="0",required=false) Integer pageNumber,
				@RequestParam(value="pageSize",defaultValue="1",required=false) Integer pageSize){
				return this.mobileService.getAllByPageNative(pageNumber,pageSize);	
			}

}
