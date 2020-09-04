package com.app.youtubeclone.entity;


import javax.persistence.*;

@Entity
@Table(name = "media_status")
public class MediaStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;

    @OneToOne
    @JoinColumn(name = "mediafileid", referencedColumnName = "id")
    public MediaFile mediaFile;

    @Column(name = "likes")
    public int likes;

    @Column(name = "dislikes")
    public int dislikes;

    @Column(name = "views")
    public int views;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MediaFile getMediaFile() {
        return mediaFile;
    }

    public void setMediaFile(MediaFile mediaFile) {
        this.mediaFile = mediaFile;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public MediaStatus(int id, MediaFile mediaFile, int likes, int dislikes, int views) {
        this.id = id;
        this.mediaFile = mediaFile;
        this.likes = likes;
        this.dislikes = dislikes;
        this.views = views;
    }

    public MediaStatus(MediaFile mediaFile, int likes, int dislikes, int views) {
        this.mediaFile = mediaFile;
        this.likes = likes;
        this.dislikes = dislikes;
        this.views = views;
    }

    public MediaStatus() {
    }
}

