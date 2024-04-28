package com.example.demo.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Authentication;
import com.example.demo.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/")
public class AuthController {
    @Autowired
    private AuthService service;

    @PostMapping("/log")
    public String login(@ModelAttribute("user") Authentication user) {
        //TODO: process POST request
        Authentication oauthUser = service.login(user.getUsername(), user.getPassword());
        System.out.print(oauthUser);
        if(Objects.nonNull(oauthUser))
        {
            return "redirect:/disp";
        }
        else{
            return "redirect:/";
        }
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("user") Authentication user) {
        //TODO: process POST request
        
        service.saveUser(user.getUsername(), user.getPassword());
        return "redirect:/disp";
    }
    
    
}
