package com.example.demoHost2.controller;


import com.example.demoHost2.dao.UserRepo;
import com.example.demoHost2.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @PostMapping("add-user")
    public ResponseEntity<String> saveUser(@RequestBody Users users) {
        userRepo.save(users);
        return new ResponseEntity<>("saved", HttpStatus.CREATED);
    }

    @GetMapping("get-all")
    public List<Users> saveUser() {
        return userRepo.findAll();
    }
}
