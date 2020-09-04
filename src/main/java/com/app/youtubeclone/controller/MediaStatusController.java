package com.app.youtubeclone.controller;


import com.app.youtubeclone.entity.MediaComment;
import com.app.youtubeclone.entity.MediaFile;
import com.app.youtubeclone.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class MediaStatusController {

    @Autowired
    MediaService mediaService;

    @PostMapping("/comment")
    public String comment(@RequestParam String id, @RequestParam String comment){
        return mediaService.createComment(id,comment);
    }

    @PostMapping("like")
    public String like(@RequestParam String id){
        return mediaService.like(id);
    }
}
