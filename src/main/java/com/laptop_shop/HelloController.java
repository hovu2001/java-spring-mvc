package com.laptop_shop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hello World from Spring Boot1111111ddd!";
    }
    @GetMapping("/user")
    public String userPage(){
        return  "Only user can access page";
    }

    @GetMapping("/admin")
    public String adminPage(){
        return  "Only admin can access page";
    }
}
