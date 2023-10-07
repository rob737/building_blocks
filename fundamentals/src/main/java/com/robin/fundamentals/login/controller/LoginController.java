package com.robin.fundamentals.login.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Value("${userName}")
    private String userName;

    @GetMapping(path = "/user")
    public ResponseEntity<String> getUser(){
        return new ResponseEntity<>("Fetched user : " + userName,HttpStatus.OK);
    }
}
