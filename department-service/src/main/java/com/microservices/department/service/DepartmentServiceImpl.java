package com.microservices.department.service;

import com.microservices.department.entity.Department;
import com.microservices.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentServiceImpl");
        return departmentRepository.save(department);
    }

    @Override
    public Department findByDepartmentId(Long departmentId) {
        log.info("Inside findByDepartmentId of DepartmentServiceImpl");
        return departmentRepository.findByDepartmentId(departmentId);
    }

}
