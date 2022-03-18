package com.wasiph.springdb.service;

import com.wasiph.springdb.model.User;
import com.wasiph.springdb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User add(User user){
        return userRepository.saveAndFlush(user);
    }
}
