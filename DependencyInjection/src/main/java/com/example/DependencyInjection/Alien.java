package com.example.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	private int aId;
	private String aName;
	private String aTech;
	
	@Autowired
	@Qualifier("hp")
	private Laptop laptop;
	
	
	public Alien() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Alien(int aId, String aName, String aTech, Laptop laptop) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.aTech = aTech;
		this.laptop = laptop;
	}


	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaTech() {
		return aTech;
	}
	public void setaTech(String aTech) {
		this.aTech = aTech;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + ", aTech=" + aTech + ", laptop=" + laptop + "]";
	}
	
	
	
	

}
