package com.example.demo.repository;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AuthenticateAction;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Authentication;

public interface AuthRepo extends JpaRepository<Authentication,String>{
    Authentication findByUsernameAndPassword(String username, String Password);
}
