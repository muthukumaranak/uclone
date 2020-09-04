package com.app.youtubeclone.service.impl;

import com.app.youtubeclone.entity.MediaFile;
import com.app.youtubeclone.repository.MediaFileRepo;
import com.app.youtubeclone.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



@Service
public class MediaServiceImpl implements MediaService {

    @Autowired
    private MediaFileRepo mediaFileRepo;


    @Override
    public Page<MediaFile> findPage(int pageNo, int pageSize, String sortField, String sortDirection,String keyword) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() : Sort.by(sortField).descending();
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        if (keyword != null) {
            return mediaFileRepo.findAllByKeyword(keyword, pageable);
        }

        return this.mediaFileRepo.findAll(pageable);
    }
}

