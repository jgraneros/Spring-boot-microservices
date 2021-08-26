package com.microservices.department.service;

import com.microservices.department.entity.Department;
import org.springframework.stereotype.Service;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department findByDepartmentId(Long departmentId);
}
