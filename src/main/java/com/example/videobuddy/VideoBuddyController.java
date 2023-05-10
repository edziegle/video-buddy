package com.example.videobuddy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;

@RestController("/api")
public class VideoBuddyController {

    final YouTubeService youTubeService;

    @Autowired
    public VideoBuddyController(YouTubeService youTubeService) {
        this.youTubeService = youTubeService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

    @GetMapping("/youtubeList")
    public String youtubeList() throws GeneralSecurityException, IOException {
        return String.valueOf(youTubeService.getChannelList());
    }

}
