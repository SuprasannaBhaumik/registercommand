package com.daimler.mbrdi.onboarding.registercommand.service;


import com.daimler.mbrdi.onboarding.registercommand.dto.UserDetailsDTO;
import com.daimler.mbrdi.onboarding.registercommand.model.UserDetails;

public interface RegistrationService {

	public void accessDenied();

	public String saveUserDetails(UserDetailsDTO user);

	UserDetails checkForUserName(String userName);
}
