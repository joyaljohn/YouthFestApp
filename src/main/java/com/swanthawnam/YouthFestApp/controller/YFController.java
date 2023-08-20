package com.swanthawnam.YouthFestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swanthanam")
public class YFController {

    @GetMapping("/login")
    public String validateLogin(){
        return "Success";
    }
}
