package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {

	@Id
	private int mobileId;
	private String mobileModel;
	private int price;
	private int  hardDisk;
	private int ram;

	public Mobile() {

		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int mobileId, String mobileModel, int price, int hardDisk, int ram) {
		super();

		this.mobileId = mobileId;
		this.mobileModel = mobileModel;
		this.price = price;
		this.hardDisk = hardDisk;
		this.ram = ram;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileModel() {
		return mobileModel;
	}

	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(int hardDisk) {
		this.hardDisk = hardDisk;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

}
