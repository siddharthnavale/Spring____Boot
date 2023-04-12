package com.example.demo.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.EmployeeDepartmentDto;
import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class ImplDepartmentService implements DepartmentService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeDepartmentDto> GetAllEmployeeDepartment() {
		
		return employeeRepository.findAll()
				.stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public EmployeeDepartmentDto convertEntityToDto(Employee employee) {
		EmployeeDepartmentDto employeeDepartmentDto= new EmployeeDepartmentDto();
		employeeDepartmentDto.setEmployeeId(employee.getEmployeeId());
		employeeDepartmentDto.setEmployeeFirstName(employee.getEmployeeFirstName());
		employeeDepartmentDto.setEmployeeLastName(employee.getEmployeeLastName());
		employeeDepartmentDto.setEmployeeEmailId(employee.getEmployeeEmailId());
		employeeDepartmentDto.setDepartmentName(employee.getEmployeeDepartment().getDepartmentName());
		return employeeDepartmentDto;
	}

}
