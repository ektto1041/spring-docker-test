package com.karpo.spring_docker_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/")
    public String index() {
        return "SUCCESS";
    }
}
