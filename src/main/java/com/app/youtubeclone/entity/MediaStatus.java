//package com.app.youtube.model;
//
//import org.springframework.beans.factory.annotation.Value;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "media_status")
//public class MediaStatus {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Value("${some.key:0}")
//    @Column(name = "likes")
//    private Long likes;
//
//    @Value("${some.key:0}")
//    @Column(name = "dislikes")
//    private Long dislikes;
//
//    @Value("${some.key:0}")
//    @Column(name = "views")
//    private Long views;
//
//    //one to one
//    private MediaFile mediaFile;
//
//    public MediaStatus() {
//    }
//
//    public MediaStatus(Long likes, Long dislikes, Long views, MediaFile mediaFile) {
//        this.likes = likes;
//        this.dislikes = dislikes;
//        this.views = views;
//        this.mediaFile = mediaFile;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getLikes() {
//        return likes;
//    }
//
//    public void setLikes(Long likes) {
//        this.likes = likes;
//    }
//
//    public Long getDislikes() {
//        return dislikes;
//    }
//
//    public void setDislikes(Long dislikes) {
//        this.dislikes = dislikes;
//    }
//
//    public Long getViews() {
//        return views;
//    }
//
//    public void setViews(Long views) {
//        this.views = views;
//    }
//
//    public MediaFile getMediaFile() {
//        return mediaFile;
//    }
//
//    public void setMediaFile(MediaFile mediaFile) {
//        this.mediaFile = mediaFile;
//    }
//}
