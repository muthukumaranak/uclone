package com.app.youtubeclone.controller;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.app.youtubeclone.service.AwsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URL;

@Controller
@RequestMapping("/aws")
public class AwsController {

    @Value("${amazonProperties.bucketName}")
    private String bucketName;

    @Autowired
    private AwsService awsService;

    private AmazonS3 s3client;

    @PostMapping("/upload")
    public String upload(@RequestParam String title, @RequestParam String description, @RequestParam String tags,
                                      @RequestParam("thumbnail") MultipartFile thumbnail, @RequestParam("video") MultipartFile video,
                                      @RequestParam String visibility, @RequestParam String restriction) {
        try {
            awsService.upload(title, description, tags, restriction, visibility, thumbnail, video);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "home";
    }

    //@DeleteMapping("/delete")
    //public String delete(@RequestParam(value= "file") String keyName) {
      //  awsService.delete(keyName);
        //return "Deleted";
    //}


}
