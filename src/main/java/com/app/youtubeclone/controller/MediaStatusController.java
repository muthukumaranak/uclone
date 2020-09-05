package com.app.youtubeclone.controller;


import com.app.youtubeclone.entity.MediaComment;
import com.app.youtubeclone.entity.MediaFile;
import com.app.youtubeclone.repository.MediaFileRepo;
import com.app.youtubeclone.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;


@Controller
public class MediaStatusController {

    @Autowired
    MediaService mediaService;

    @Autowired
    MediaFileRepo mediaFileRepo;

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

    @GetMapping("/receiveall")
    public String retrieve(Model model) {
        List<MediaFile> listDTOS = new LinkedList<>();
        List<MediaFile> list = mediaFileRepo.findAll();
        list.forEach(blogPost -> {
            MediaFile blogPostDTO = new MediaFile();
            blogPostDTO.setId(blogPost.getId());
            blogPostDTO.setOwner(blogPost.getOwner());
            blogPostDTO.setThumbnailUrl(blogPost.getThumbnailUrl());
            blogPostDTO.setVideoUrl(blogPost.getVideoUrl());
            List<MediaComment> commentDTOS = new LinkedList();
            blogPost.getMediaComment().forEach(comment -> {
                MediaComment commentDTO = new MediaComment();
                commentDTO.setCommentby(comment.getCommentby());
                commentDTO.setComment(comment.getComment());
                commentDTO.setId(comment.getId());
                commentDTOS.add(commentDTO);
            });
            blogPostDTO.setMediaComment(commentDTOS);
            listDTOS.add(blogPostDTO);
        });
        model.addAttribute("list",listDTOS);
        return "ssss";
    }
}
