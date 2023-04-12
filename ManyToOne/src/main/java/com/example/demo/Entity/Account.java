package com.example.demo.Entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account {
	
	@Id
	private int accountId;
	private int accountNumber;
	private String fullName;
	private BigDecimal balance;
	
	@ManyToOne
    private Branch branch;

	//As you see, We have included the Branch object itself instead of “branch_id”. 
	//And we also marked this object field as @ManyToOne. By using this annotation, 
	//we are letting Spring Data JPA know that this is a join with a many to one 
	//relationship. So when JPA evaluates this, it will find and map the entire 
	//branch object instead of just the branch_id.

 //By doing the many to one mapping, whenever we query for Account entities, we 
//can also hold the information about its Branch details.
	


}
