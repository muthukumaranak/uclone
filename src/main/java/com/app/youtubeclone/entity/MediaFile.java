package com.app.youtubeclone.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "media_file")
public class MediaFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "tag")
    private String tag;

    @Column(name = "restriction")
    private String restriction;

    @Column(name = "createdAt")
    private String createdAt;

    @Column(name = "visibility")
    private String visibility;

    @Column(name = "thumbnailUrl")
    private String thumbnailUrl;

    @Column(name = "videoUrl")
    private String videoUrl;

    @Column(name = "owner")
    private String owner;

    @OneToOne(mappedBy = "mediaFile", fetch = FetchType.EAGER, cascade = CascadeType.ALL,orphanRemoval = true, targetEntity = MediaStatus.class)
    private List<MediaStatus> mediaStatus;

    @OneToMany(mappedBy = "mediaComment", fetch = FetchType.EAGER, cascade = CascadeType.ALL,orphanRemoval = true, targetEntity = MediaComment.class)
    private List<MediaComment> mediaComment;

    public MediaFile() {
    }

    public MediaFile(String title, String description, String tag, String restriction, String createdAt,
                     String visibility, String thumbnailUrl, String videoUrl, String owner) {
        this.title = title;
        this.description = description;
        this.tag = tag;
        this.restriction = restriction;
        this.createdAt = createdAt;
        this.visibility = visibility;
        this.thumbnailUrl = thumbnailUrl;
        this.videoUrl = videoUrl;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public MediaStatus getMediaStatus() {
        return (MediaStatus) mediaStatus;
    }

    public void setMediaStatus(MediaStatus mediaStatus) {
        this.mediaStatus = (List<MediaStatus>) mediaStatus;
    }

    public List<MediaComment> getMediaComment() {
        return mediaComment;
    }

    public void setMediaComment(List<MediaComment> mediaComment) {
        this.mediaComment = mediaComment;
    }
}

