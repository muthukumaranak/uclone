package com.app.youtubeclone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @GetMapping("/userRegistration")
    public String userRegistration(){
        return "userRegistration";
    }

    @GetMapping("/channelRegistration")
    public String channelRegistration(){
        return "channelRegistration";
    }
}
