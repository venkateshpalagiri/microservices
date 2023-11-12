package com.venkatesh.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.venkatesh.employeeservice.response.EmployeeResponse;
import com.venkatesh.employeeservice.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees/{id}")
	ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id){
		
//		db call -> employee 1
		EmployeeResponse employeeResponse=employeeService.getEmployeeDetails(id);
		return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
		
	}

}
