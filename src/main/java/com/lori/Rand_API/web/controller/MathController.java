package com.lori.Rand_API.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/math-calculus")
public class MathController {
    @GetMapping("/")
    public ResponseEntity<String> sayHellobro(){
        return new ResponseEntity<String>("Hello controller context", HttpStatus.OK);
    }

    @GetMapping("/fibonacciOf5")
    public ResponseEntity<String> getFibonnaci(){
        return new ResponseEntity<>(String.valueOf(5), HttpStatus.OK);
    }
}
