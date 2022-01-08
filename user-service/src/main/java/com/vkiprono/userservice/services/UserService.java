package com.vkiprono.userservice.services;

import com.vkiprono.userservice.DTOs.Department;
import com.vkiprono.userservice.DTOs.ResponseTemplateDTO;
import com.vkiprono.userservice.constants.RestUrls;
import com.vkiprono.userservice.entities.User;
import com.vkiprono.userservice.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info(":::::Beginning of UserService.saveUser():::::");
        return userRepository.save(user);
    }

    public User findByUserId(Long userId) {
        log.info(":::::Beginning of UserService.findById():::::");
        return userRepository.findByUserId(userId);
    }

    public ResponseTemplateDTO getUserWithDepartment(Long userId) {
        log.info(":::::Beginning of UserService.getUserWithDepartment():::::");
        ResponseTemplateDTO responseTemplateDTO = new ResponseTemplateDTO();
        User user = userRepository.findByUserId(userId);

        Department department = restTemplate.getForObject(  "http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
        // Department department = restTemplate.getForObject("http://localhost:9002/departments/" + user.getDepartmentId(), Department.class);

        responseTemplateDTO.setUser(user);
        responseTemplateDTO.setDepartment(department);

        return responseTemplateDTO;
    }
}
