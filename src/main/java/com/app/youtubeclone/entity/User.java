//package com.app.youtube.model;
//
//import org.springframework.data.domain.Page;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "users")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "user_name")
//    private String username;
//
//    @Column(name = "email")
//    private String email;
//
//    @Column(name = "password")
//    private String password;
//
//    @Column(name = "channel")
//    private String channel;
//
//    //one to many
//    private MediaFile mediaFile;
//
//    public User() {
//    }
//
//    public User(String username, String email, String password, String channel, MediaFile mediaFile) {
//        this.username = username;
//        this.email = email;
//        this.password = password;
//        this.channel = channel;
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
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getChannel() {
//        return channel;
//    }
//
//    public void setChannel(String channel) {
//        this.channel = channel;
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
