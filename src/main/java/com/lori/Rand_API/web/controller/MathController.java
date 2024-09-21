package com.lori.Rand_API.web.controller;

import com.lori.Rand_API.domain.service.MathCalculusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/math-calculus")
public class MathController {
    @Autowired
    private MathCalculusService calculusService;

    @GetMapping("/")
    public ResponseEntity<String> sayHellobro(){
        return new ResponseEntity<String>("Hello controller context", HttpStatus.OK);
    }

    @GetMapping("/fibonacciOf5")
    public ResponseEntity<String> getFibonnaci(){
        return new ResponseEntity<>(calculusService.staticFibonacci(), HttpStatus.OK);
    }

    @GetMapping("/fibonacci/{iterations}")
    public ResponseEntity<String> getFibonnaci(@PathVariable("iterations") int interation){
        return new ResponseEntity<>(calculusService.fibonacci(interation), HttpStatus.OK);
    }
}
