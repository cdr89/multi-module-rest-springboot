package com.example.demo2.restcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class SecondRestController {

    @GetMapping("/2")
    ResponseEntity<?> get() {
        return ok("2");
    }
}
