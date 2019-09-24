package com.daimler.mbrdi.onboarding.registercommand.repository;

import com.daimler.mbrdi.onboarding.registercommand.model.UserDetails;
import org.springframework.data.repository.CrudRepository;

public interface RegisterRepository extends CrudRepository<UserDetails, Integer> {

    UserDetails findByUserName(String name);
}
