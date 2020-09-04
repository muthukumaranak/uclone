package com.app.youtubeclone.repository;


import com.app.youtubeclone.entity.MediaStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaStatusRepo extends JpaRepository<MediaStatus, Integer> {
}
