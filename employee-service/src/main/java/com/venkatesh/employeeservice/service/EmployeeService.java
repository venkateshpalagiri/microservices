package com.venkatesh.employeeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venkatesh.employeeservice.entity.Employee;
import com.venkatesh.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee getEmployeeDetails(int id) {
		Employee employee=employeeRepository.findById(id).get();
		return employee;
		
		
	}

}
