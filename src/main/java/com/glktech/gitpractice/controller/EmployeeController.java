package com.glktech.gitpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {

      @GetMapping("/wishme")
      public String generateWishMsg(){
        return "Hello Good Afternoon ! ";
      }

      @GetMapping("/error")
      public String error(){
        return "errorMsg";
      }
}
