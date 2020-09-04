package com.app.youtubeclone.controller;

import com.app.youtubeclone.entity.MediaFile;
import com.app.youtubeclone.repository.MediaFileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    MediaFileRepo mediaFileRepo;


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


    @GetMapping("/getall")
    public void get(){
        List<MediaFile> list = mediaFileRepo.findAll();

    }
}
