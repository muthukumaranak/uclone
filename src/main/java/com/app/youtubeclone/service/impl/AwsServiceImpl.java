package com.app.youtubeclone.service.impl;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.app.youtubeclone.service.AwsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URL;

@Service
public class AwsServiceImpl implements AwsService {

    @Autowired
    private AmazonS3 s3client;

    @Value("${amazonProperties.bucketName}")
    private String bucketName;

    @Override
    public void uploadFile(String videoKey, MultipartFile video, String thumbnailKey,MultipartFile thumbnail ) throws IOException {
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(video.getSize());
            s3client.putObject(bucketName, videoKey, video.getInputStream(),metadata);
            URL videoUrl = s3client.getUrl(bucketName, videoKey);

            metadata.setContentLength(thumbnail.getSize());
            s3client.putObject(bucketName, thumbnailKey, thumbnail.getInputStream(),metadata);

            URL thumbnailUrl = s3client.getUrl(bucketName,thumbnailKey);
            System.out.println("Video => "+ videoUrl +" thumbnail => " +thumbnailUrl);
    }

    @Override
    public void delete(String keyName) {

    }
}
