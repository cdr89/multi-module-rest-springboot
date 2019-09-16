package com.example.demo1.restcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class FirstRestController {

    @GetMapping("/1")
    ResponseEntity<?> get() {
        return ok("1");
    }
}
