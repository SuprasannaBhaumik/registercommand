package com.daimler.mbrdi.onboarding.registercommand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RegistercommandApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistercommandApplication.class, args);
    }

}
