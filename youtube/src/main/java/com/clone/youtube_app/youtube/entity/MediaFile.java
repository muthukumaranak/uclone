package com.clone.youtube_app.youtube.entity;


import javax.persistence.*;

@Entity
@Table(name = "mediafile")
public class MediaFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;


}
