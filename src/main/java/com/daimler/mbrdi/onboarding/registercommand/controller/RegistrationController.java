package com.daimler.mbrdi.onboarding.registercommand.controller;

import com.daimler.mbrdi.onboarding.registercommand.dto.UserDetailsDTO;
import com.daimler.mbrdi.onboarding.registercommand.model.UserDetails;
import com.daimler.mbrdi.onboarding.registercommand.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    RegistrationService myService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserDetailsDTO userDetailsDTO) {

        try {
            if (userDetailsDTO != null) {
                UserDetails existingUser = myService.checkForUserName(userDetailsDTO.getUserName());

                if (existingUser != null) {
                    return ResponseEntity.ok("userExists");
                }

                String response = myService.saveUserDetails(userDetailsDTO);
                return ResponseEntity.ok(response);
            }
            return ResponseEntity.ok("badRequest");
        } catch (Exception e){
            return ResponseEntity.ok("error");
        }
    }
}
