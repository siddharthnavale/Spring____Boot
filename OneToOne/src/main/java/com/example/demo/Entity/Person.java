package com.example.demo.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Person {
	@Id
	private int personId;
	private String first_Name;
	private String last_Name;
	private String city;
	
    @JsonBackReference
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="mobile_Id")
	private Mobile mobile;
	
	
	
	

}
