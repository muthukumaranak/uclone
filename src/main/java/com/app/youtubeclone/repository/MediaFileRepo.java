package com.app.youtubeclone.repository;


import com.app.youtubeclone.entity.MediaFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaFileRepo extends JpaRepository<MediaFile, Integer> {
}
