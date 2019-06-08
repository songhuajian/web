package com.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {
    @RequestMapping(value = "/insertUser")
    public String insertUser() {
        return "true";
    }
}
