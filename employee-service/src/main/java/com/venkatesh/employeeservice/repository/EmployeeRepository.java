package com.venkatesh.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venkatesh.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
