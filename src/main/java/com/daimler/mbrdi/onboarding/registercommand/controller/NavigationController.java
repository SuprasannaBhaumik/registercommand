package com.daimler.mbrdi.onboarding.registercommand.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NavigationController {

    @GetMapping("/welcome")
    public ResponseEntity<String> greetToPortal() {
        return ResponseEntity.ok("Welcome to the portal");
    }
}
