package com.example.videobuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class VideoBuddyApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoBuddyApplication.class, args);
    }

}
