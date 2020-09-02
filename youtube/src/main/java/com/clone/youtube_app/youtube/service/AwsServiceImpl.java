package com.clone.youtube_app.youtube.service;


import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.net.URL;

@Service
public class AwsServiceImpl implements AwsService {

    @Autowired
    private AmazonS3 s3client;

    @Value("${gkz.s3.bucket}")
    private String bucketName;


    @Override
    public void upload(String keyName, MultipartFile file) {
        try {
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(file.getSize());
            s3client.putObject(bucketName, keyName, file.getInputStream(), metadata);
            URL url = s3client.getUrl(bucketName, keyName);
            System.out.println(url);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void delete(String keyName) {
        try {
            final DeleteObjectRequest deleteObjectRequest = new DeleteObjectRequest(bucketName, keyName);
            s3client.deleteObject(deleteObjectRequest);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
