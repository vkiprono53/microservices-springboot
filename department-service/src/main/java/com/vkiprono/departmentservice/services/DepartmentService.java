package com.vkiprono.departmentservice.services;

import com.vkiprono.departmentservice.entities.Department;
import com.vkiprono.departmentservice.repositories.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info(":::::Inside DepartmentService.saveDepartment():::::");
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long departmentId) {
        log.info(":::::Inside DepartmentService.findByDepartmentId():::::");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}