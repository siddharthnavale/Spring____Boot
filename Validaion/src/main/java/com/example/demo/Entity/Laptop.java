package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Validating Path Variables with using @Validated on RestController(Here require)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laptop {
	
	@Id
	private int laptopId;
	private String laptopModel;
	private String price;
	private String hardDisk;	
	private String ram;
}
