package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Authentication;
import com.example.demo.repository.*;

@Service
public class AuthService {
    @Autowired
    private AuthRepo rep;

    public Authentication login(String username, String Password)
    {
        Authentication user = rep.findByUsernameAndPassword(username, Password);
        return user;
    }

    public void saveUser(String username, String password)
    {
        Authentication user = new Authentication();
        user.setUsername(username);
        user.setPassword(password);
        rep.save(user);
    } 
}
