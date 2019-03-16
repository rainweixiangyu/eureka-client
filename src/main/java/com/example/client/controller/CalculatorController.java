package com.example.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

  @GetMapping("/add")
  public Integer add(@RequestParam Integer op1, @RequestParam Integer op2){
    return op1 + op2;
  }
}
