package com.app.youtubeclone.service;

import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;


public interface AwsService {


    public void uploadFile(String videoKey, MultipartFile video, String thumbnailKey, MultipartFile thumbnail) throws IOException;
    public void delete(String keyName);
}
