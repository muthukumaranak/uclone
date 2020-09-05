package com.app.youtubeclone.service;

import com.app.youtubeclone.repository.UserRepo;
import com.app.youtubeclone.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService
{

    @Autowired
    UserRepo usersRepo;

    public String register(String name, String email, String password) {
        try{
            User users = new User(name,email,password);
            usersRepo.save(users);
            return "home";
        }catch (Exception e){
            return "error";
        }

    }
}
