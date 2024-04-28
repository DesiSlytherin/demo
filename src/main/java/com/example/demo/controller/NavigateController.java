package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigateController {
  @GetMapping("/reg")
  public String reg() {
      return "register";
  }

  @GetMapping("/disp")
  public String display() {
      return "disp";
  }
}
