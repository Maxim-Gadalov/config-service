package com.mhadalau.ecosystem.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/health")
public class HealthCheck {

    @GetMapping
    public ResponseEntity<Void> health(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
