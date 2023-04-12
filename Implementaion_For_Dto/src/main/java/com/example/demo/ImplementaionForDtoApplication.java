package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Department;
import com.example.demo.Entity.Employee;
import com.example.demo.Repository.DepartmentRepository;
import com.example.demo.Repository.EmployeeRepository;

@SpringBootApplication
public class ImplementaionForDtoApplication implements CommandLineRunner {
	
	@Autowired
    private DepartmentRepository departmentRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ImplementaionForDtoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Department d= new Department();
		d.setDepartmentId(100);
		d.setDepartmentName("Design");
		d.setDepartmentDescription("Require Core Knowledge");
		
		Department d1 =  departmentRepository.save(d);
		
		
		Employee e= new Employee();
		e.setEmployeeId(1);
		e.setEmployeeFirstName("Tilak");
		e.setEmployeeLastName("Varma");
		e.setEmployeeEmailId("Tilak@gmail.com");
		e.setEmployeeDepartment(d);
		
		employeeRepository.save(e);
		
		
		
		
		
		
	}

}
