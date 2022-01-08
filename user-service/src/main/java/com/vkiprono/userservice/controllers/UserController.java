package com.vkiprono.userservice.controllers;

import com.vkiprono.userservice.DTOs.ResponseTemplateDTO;
import com.vkiprono.userservice.entities.User;
import com.vkiprono.userservice.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info(":::::Beginning of UserService.saveUser():::::");
        return userService.saveUser(user);
    }

/*    @GetMapping("/{userId}")
    public User findByUserId(@PathVariable Long userId) {
        log.info(":::::Beginning of UserController.findById():::::");
        return userService.findByUserId(userId);
    }*/

    @GetMapping("/{userId}")
    public ResponseTemplateDTO getUserWithDepartment(@PathVariable Long userId) {
        log.info(":::::Beginning of UserController.getUserWithDepartment():::::");
        return userService.getUserWithDepartment(userId);
    }
}
