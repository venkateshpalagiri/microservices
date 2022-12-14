package com.mrvkigns.department.service;

import com.mrvkigns.department.entity.Department;
import com.mrvkigns.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    public Department saveDepartment(Department department){
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }
    public Department getDepartmentById(Long departmentId){
        log.info("Inside getDepartmentById of 'DepartmentService'");
        return departmentRepository.findById(departmentId).get();
    }
}
