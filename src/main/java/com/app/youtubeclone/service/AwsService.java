package com.app.youtubeclone.service;

import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;


public interface AwsService {


    void upload(String title, String description, String tags, String restriction, String visibility, MultipartFile thumbnail, MultipartFile video,int likes, int dislikes, int views, String duration, Boolean watchLater) throws IOException;
    public void delete(String keyName);
}
