package com.lori.Rand_API.web.controller;

import com.lori.Rand_API.domain.service.StringManipulatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/string-operations")
public class StringController {

    @Autowired
    StringManipulatingService stringMService;

    @PostMapping("/reverse-string")
    public ResponseEntity<String> reverseString(@RequestBody String a){
        return new ResponseEntity<>(stringMService.changeorderString(a), HttpStatus.OK);
    }

}
