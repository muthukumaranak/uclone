package com.app.youtubeclone.service.impl;

import com.app.youtubeclone.entity.Users;
import com.app.youtubeclone.repository.UsersRepo;
import com.app.youtubeclone.service.UserService;
import org.springframework.stereotype.Service;

import java.security.KeyStore;

@Service
public class UserServiceImpl implements UserService {

    private UsersRepo usersRepo;
    @Override
    public String register(String name, String email, String password) {

        try{
            Users users = new Users(name,email,password);
            usersRepo.save(users);
            return "home";
        }catch (Exception e){
            return "error";
        }
    }
}
