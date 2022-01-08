package com.vkiprono.departmentservice.controllers;

import com.vkiprono.departmentservice.entities.Department;
import com.vkiprono.departmentservice.services.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info(":::::Inside DepartmentController.saveDepartment():::::");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{departmentId}")
    public Department findDepartmentById(@PathVariable("departmentId") Long departmentId) {
        log.info(":::::Inside DepartmentController.findDepartmentById():::::");
        return departmentService.findByDepartmentId(departmentId);
    }
}
