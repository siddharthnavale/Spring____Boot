package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	
	@Id
	private int employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeEmailId;
	
	@OneToOne
	@JoinColumn(name="department_Id")
	private Department employeeDepartment;
	
	

}
