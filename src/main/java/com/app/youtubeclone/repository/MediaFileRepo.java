package com.app.youtubeclone.repository;


import com.app.youtubeclone.entity.MediaFile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaFileRepo extends JpaRepository<MediaFile, Integer> {

    @Query("SELECT m FROM MediaFile m  WHERE m.title LIKE %?1%" + "OR m.description LIKE %?1%" + "OR m.owner LIKE %?1%" + "OR m.tag LIKE %?1%")
    Page<MediaFile> findAllByKeyword(String keyword, Pageable pageable);
}
