package com.daimler.mbrdi.onboarding.registercommand.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserDetailsDTO {

    private int userId;

    private String userName;

    private String password;

}
