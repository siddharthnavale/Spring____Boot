package com.example.demo.Entity;

import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



//Validating a Request Body without using @Validated on RestController(Here not require)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Mobile {

	@Id
    @Min(1)
	private int mobileId;
	@NotBlank(message="mobileModel is mandatory")
	private String mobileModel;
	@NotBlank
	private String price;
	@NotBlank
	private String hardDisk;
	@NotBlank	
	private String ram;


}
