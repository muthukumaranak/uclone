package com.clone.youtube_app.youtube.service;

import org.springframework.web.multipart.MultipartFile;


public interface AwsService {
    public void upload(String keyName, MultipartFile file);
    public void delete(String keyName);
}
