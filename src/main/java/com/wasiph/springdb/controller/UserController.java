package com.wasiph.springdb.controller;

import com.wasiph.springdb.model.User;
import com.wasiph.springdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping
    public User add(@RequestBody User user){
        return userService.add(user);
    }
}
