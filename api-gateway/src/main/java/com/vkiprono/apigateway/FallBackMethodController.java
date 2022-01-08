package com.vkiprono.apigateway;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackMethodController {


    @GetMapping("/userService")
    public String userServiceFallbackMethod() {
        return "User service method is taking long to respond \n" +
                "Please try again later!!!";
    }
    @GetMapping("/departmentService")
    public String departmentServiceFallbackMethod() {
        return "Department service method is taking long to respond \n" +
                "Please try again later!!!";
    }
}
