package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.EmployeeDepartmentDto;
import com.example.demo.Service.DepartmentService;

@RestController
public class employeeController{
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/dto")
	public List <EmployeeDepartmentDto> getAllEmployeeDepartment(){
		return departmentService.GetAllEmployeeDepartment();
	}
	
	
	
	

}
