package com.example.demo.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Mobile {

	@Id
	private int mobileId;
	private String mobileModel;
	private String price;
	private String hardDisk;
	private String ram;
	
	@JsonManagedReference
	@OneToOne(cascade=CascadeType.ALL,mappedBy = "mobile")
    private Person person;

	

}
