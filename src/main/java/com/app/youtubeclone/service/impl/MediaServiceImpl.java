package com.app.youtubeclone.service.impl;

import com.app.youtubeclone.entity.MediaComment;
import com.app.youtubeclone.entity.MediaFile;
import com.app.youtubeclone.repository.MediaCommentRepo;
import com.app.youtubeclone.repository.MediaFileRepo;
import com.app.youtubeclone.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class MediaServiceImpl implements MediaService {

    @Autowired
    private MediaFileRepo mediaFileRepo;

    @Autowired
    private MediaCommentRepo mediaCommentRepo;


    @Override
    public Page<MediaFile> findPage(int pageNo, int pageSize, String sortField, String sortDirection,String keyword) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() : Sort.by(sortField).descending();
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        if (keyword != null) {
            return mediaFileRepo.findAllByKeyword(keyword, pageable);
        }

        return this.mediaFileRepo.findAll(pageable);
    }

    @Override
    public String createComment(String id, String comment) {
        try{
            MediaFile mediaFile = new MediaFile();
            mediaFile.setId(Integer.parseInt(id));
            String commentby = "admin";
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String created_at = f.format(new Date());
            MediaComment mediaComment = new MediaComment(commentby, comment, mediaFile, created_at);
            mediaCommentRepo.save(mediaComment);
            return "added";
        }catch (Exception e){
            System.out.println(e);
            return "Failed to add comment";
        }
    }

    @Override
    public String like(String id) {
        try{
            Optional<MediaFile> list = mediaFileRepo.findById(Integer.parseInt(id));

            return "Liked";
        }catch (Exception e){
            System.out.println(e);
            return "Not added";
        }
    }
}

