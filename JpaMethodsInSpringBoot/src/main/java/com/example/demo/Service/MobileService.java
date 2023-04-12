package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Mobile;

public interface MobileService {

	public List<Mobile> getAllMobiles();

	public Mobile getMobile(int mobileId);

	public Mobile addMoblie(Mobile mobile);

	public Mobile deleteMobile(int mobileId);

	public List<Mobile> getMobilesByModelName(String mobileModel);

	public List<Mobile> getByPriceLessThan(int price);

	public List<Mobile> getByHardDiskGreaterThan(int hardDisk);

	public List<Mobile> getMobileBypriceAndHardDisk(int price, int hardDisk);

	public List<Mobile> getByRam(int ram);

	public List<Mobile> getAll();

	public List<Mobile> getAllBasedOnLength();

	



	

	

	

	



	
	

}
