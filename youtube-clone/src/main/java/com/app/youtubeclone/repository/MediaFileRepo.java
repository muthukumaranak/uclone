package com.app.youtubeclone.repository;


import com.amazonaws.services.dynamodbv2.xspec.S;
import com.app.youtubeclone.entity.MediaFile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaFileRepo extends JpaRepository<MediaFile, Integer> {

    @Query("SELECT m FROM MediaFile m  WHERE m.title LIKE %?1%" + "OR m.description LIKE %?1%" + "OR m.owner LIKE %?1%" + "OR m.tag LIKE %?1%")
    Page<MediaFile> search(String keyword, Pageable pageable);

    @Query("SELECT m FROM MediaFile m WHERE m.tag LIKE %?1%")
    Page<MediaFile> filterByTag(String tag, Pageable pageable);

    List<MediaFile> findTop2ByOrderByViewsDesc();

    @Query("SELECT m FROM MediaFile m WHERE m.watchLater = :true")
    List<MediaFile> findAllWatchLater();
}
