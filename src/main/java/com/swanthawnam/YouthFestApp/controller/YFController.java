package com.swanthawnam.YouthFestApp.controller;

import com.swanthawnam.YouthFestApp.dto.LoginDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swanthanam")
public class YFController {

    @GetMapping("/login")
    public ResponseEntity<LoginDTO> validateLogin(){
        return ResponseEntity.ok(new LoginDTO("Success"));
    }
}
