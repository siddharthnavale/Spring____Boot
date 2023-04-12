package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.EmployeeDepartmentDto;
import com.example.demo.Entity.Employee;

public interface DepartmentService{

public List<EmployeeDepartmentDto> GetAllEmployeeDepartment();

public EmployeeDepartmentDto convertEntityToDto(Employee employee);








}
