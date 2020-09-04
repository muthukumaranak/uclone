package com.app.youtubeclone.service;

import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.net.URL;


public interface AwsService {
    void upload(String title, String description, String tags, String restriction, String visibility, MultipartFile thumbnail, MultipartFile video) throws IOException;
}
