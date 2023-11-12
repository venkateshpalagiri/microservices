package com.venkatesh.employeeservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venkatesh.employeeservice.entity.Employee;
import com.venkatesh.employeeservice.repository.EmployeeRepository;
import com.venkatesh.employeeservice.response.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ModelMapper modelMapper;
	
	public EmployeeResponse getEmployeeDetails(int id) {
		Employee employee=employeeRepository.findById(id).get();
		EmployeeResponse employeeResponse=modelMapper.map(employee, EmployeeResponse.class);
		
		return employeeResponse;
		
	}

}
