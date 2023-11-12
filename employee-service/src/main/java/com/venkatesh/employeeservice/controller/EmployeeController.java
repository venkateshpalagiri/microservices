package com.venkatesh.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.venkatesh.employeeservice.entity.Employee;
import com.venkatesh.employeeservice.repository.EmployeeRepository;
import com.venkatesh.employeeservice.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees/{id}")
	Employee getEmployeeDetails(@PathVariable("id") int id){
		
		//db call -> employee 1
		Employee employee=employeeService.getEmployeeDetails(id);
		return employee;
		
	}

}
