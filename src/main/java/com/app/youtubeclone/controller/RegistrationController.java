package com.app.youtubeclone.controller;

import com.app.youtubeclone.service.ChannelService;
import com.app.youtubeclone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    UserService userService;

    @Autowired
    ChannelService channelService;

    @PostMapping("/user")
    public String userRegistration(@RequestParam String name, @RequestParam String email, @RequestParam String password){
        return userService.register(name, email, password);
    }

    @PostMapping("/channel")
    public String channelRegistration(@RequestParam String name, @RequestParam String description,
                                      @RequestParam("thumbnail") MultipartFile thumbnail){
        return channelService.register(name, description, thumbnail);
    }
}
