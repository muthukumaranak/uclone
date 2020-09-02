package com.clone.youtube_app.youtube.controller;


import com.clone.youtube_app.youtube.service.AwsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/aws")
public class AwsController {

    @Autowired
    AwsService awsService;

    @PostMapping("/upload")
    public String uploadMultipartFile(@RequestParam("file") MultipartFile file) {
        String keyName = file.getOriginalFilename();
        awsService.upload(keyName, file);
        return "Uploaded";
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam(value= "file") String keyName) {
        awsService.delete(keyName);
        return "Deleted";
    }
}
