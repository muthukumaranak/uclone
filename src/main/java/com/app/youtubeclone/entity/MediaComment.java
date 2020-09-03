//package com.app.youtube.model;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//@Table(name = "media_comment")
//public class MediaComment {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "comment")
//    private String comment;
//
//    @Column(name = "created_at")
//    private Date commentCreatedAt;
//
//    //ManyToOne
//    private MediaFile mediaFile;
//
//    //ManyToOne
//    private User user;
//
//    public MediaComment() {
//    }
//
//    public MediaComment(String comment, Date commentCreatedAt, MediaFile mediaFile, User user) {
//        this.comment = comment;
//        this.commentCreatedAt = commentCreatedAt;
//        this.mediaFile = mediaFile;
//        this.user = user;
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
//    public String getComment() {
//        return comment;
//    }
//
//    public void setComment(String comment) {
//        this.comment = comment;
//    }
//
//    public Date getCommentCreatedAt() {
//        return commentCreatedAt;
//    }
//
//    public void setCommentCreatedAt(Date commentCreatedAt) {
//        this.commentCreatedAt = commentCreatedAt;
//    }
//
//    public MediaFile getMediaFile() {
//        return mediaFile;
//    }
//
//    public void setMediaFile(MediaFile mediaFile) {
//        this.mediaFile = mediaFile;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//}
