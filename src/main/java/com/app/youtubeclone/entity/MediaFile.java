//package com.app.youtube.model;
//
//import javax.persistence.*;
//import java.util.Date;
//import java.util.List;
//
//@Entity
//@Table(name = "media_file")
//public class MediaFile {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "title")
//    private String title;
//
//    @Column(name = "description")
//    private String description;
//
//    @Column(name = "tag")
//    private String tag;
//
//    @Column(name = "restriction")
//    private Boolean restriction;
//
//    @Column(name = "createdAt")
//    private Date createdAt;
//
//    @Column(name = "visibility")
//    private Boolean visibility;
//
//    @Column(name = "thumbnailUrl")
//    private String thumbnailUrl;
//
//    @Column(name = "videoUrl")
//    private String videoUrl;
//
//
//    private User user;
//
//    @OneToOne(mappedBy = "mediaStatus", fetch = FetchType.EAGER, cascade = CascadeType.ALL,orphanRemoval = true, targetEntity = MediaStatus.class)
//    private MediaStatus mediaStatus;
//
//    @OneToOne(mappedBy = "mediaComment", fetch = FetchType.EAGER, cascade = CascadeType.ALL,orphanRemoval = true, targetEntity = MediaComment.class)
//    private List<MediaComment> mediaComment;
//
//    public MediaFile() {
//    }
//
//    public MediaFile(String title, String description, String tag, Boolean restriction, Date createdAt, Boolean visibility, String thumbnailUrl, String videoUrl, User user, MediaStatus mediaStatus) {
//        this.title = title;
//        this.description = description;
//        this.tag = tag;
//        this.restriction = restriction;
//        this.createdAt = createdAt;
//        this.visibility = visibility;
//        this.thumbnailUrl = thumbnailUrl;
//        this.videoUrl = videoUrl;
//        this.user = user;
//        this.mediaStatus = mediaStatus;
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
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getTag() {
//        return tag;
//    }
//
//    public void setTag(String tag) {
//        this.tag = tag;
//    }
//
//    public Boolean getRestriction() {
//        return restriction;
//    }
//
//    public void setRestriction(Boolean restriction) {
//        this.restriction = restriction;
//    }
//
//    public Date getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public Boolean getVisibility() {
//        return visibility;
//    }
//
//    public void setVisibility(Boolean visibility) {
//        this.visibility = visibility;
//    }
//
//    public String getThumbnailUrl() {
//        return thumbnailUrl;
//    }
//
//    public void setThumbnailUrl(String thumbnailUrl) {
//        this.thumbnailUrl = thumbnailUrl;
//    }
//
//    public String getVideoUrl() {
//        return videoUrl;
//    }
//
//    public void setVideoUrl(String videoUrl) {
//        this.videoUrl = videoUrl;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public MediaStatus getMediaStatus() {
//        return mediaStatus;
//    }
//
//    public void setMediaStatus(MediaStatus mediaStatus) {
//        this.mediaStatus = mediaStatus;
//    }
//}
