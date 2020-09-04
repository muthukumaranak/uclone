package com.app.youtubeclone.controller;


import com.app.youtubeclone.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MediaStatusController {

    @Autowired
    MediaService mediaService;

    @PostMapping("/comment")
    public String comment(@RequestParam String id, @RequestParam String comment){
        return mediaService.createComment(id,comment);
    }

    @PostMapping("/like")
    public String like(@RequestParam String id){
        return mediaService.like(id);
    }

    @PostMapping("/dislike")
    public String dislike(@RequestParam String id){
        return mediaService.dislike(id);
    }

    @PostMapping("/views")
    public String views(@RequestParam String id){
        return mediaService.views(Integer.parseInt(id));
    }
}
