package com.demo.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/demo")
    public ResponseEntity<String> getData() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
