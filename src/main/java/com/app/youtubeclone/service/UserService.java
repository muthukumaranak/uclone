package com.app.youtubeclone.service;

import com.app.youtubeclone.entity.Users;
import com.app.youtubeclone.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService
{

    @Autowired
    UsersRepo usersRepo;

    public String register(String name, String email, String password) {
        try{
            Users users = new Users(name,email,password);
            usersRepo.save(users);
            return "redirect:/";
        }catch (Exception e){
            return "error";
        }
    }


}
