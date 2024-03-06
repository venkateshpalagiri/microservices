package com.venkatesh.employeeservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.venkatesh.employeeservice.entity.Employee;
import com.venkatesh.employeeservice.repository.EmployeeRepository;
import com.venkatesh.employeeservice.response.AddressResponse;
import com.venkatesh.employeeservice.response.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private RestTemplate restTemplate;
	
	public EmployeeResponse getEmployeeDetails(int id) {
		
		Employee employee=employeeRepository.findById(id).get();
		EmployeeResponse employeeResponse=modelMapper.map(employee, EmployeeResponse.class);
		restTemplate.getFor
		AddressResponse addressResponse=restTemplate.getForObject("http://localhost:8081/address-service/api/address/{id}", AddressResponse.class, id);
		
		employeeResponse.setAddressResponse(addressResponse);
		
		return employeeResponse;
		
	}

}
