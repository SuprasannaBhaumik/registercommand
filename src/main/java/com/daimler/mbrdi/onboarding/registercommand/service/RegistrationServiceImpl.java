package com.daimler.mbrdi.onboarding.registercommand.service;

import com.daimler.mbrdi.onboarding.registercommand.dto.UserDetailsDTO;
import com.daimler.mbrdi.onboarding.registercommand.model.UserDetails;
import com.daimler.mbrdi.onboarding.registercommand.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {


    @Autowired
    private RegisterRepository registerRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void accessDenied() {
        //
    }

    @Override
    public UserDetails checkForUserName(String userName) {
        return null;
    }


    public String saveUserDetails(UserDetailsDTO user) {

        UserDetails user1 = new UserDetails();
        user1.setUserName(user.getUserName());
        user1.setPassword(passwordEncoder.encode(user.getPassword()));

        try {
            registerRepository.save(user1);
            return "user is saved successfully";
        } catch (Exception e) {
            e.printStackTrace();


       }
        return "";

    }
}
