package com.app.youtubeclone.service;

import com.app.youtubeclone.config.MyUserDetails;
import com.app.youtubeclone.entity.Users;
import com.app.youtubeclone.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    

    public Users save(Users user) {
        Users users = new Users(user.getName(),user.getEmail(),
                bCryptPasswordEncoder.encode(user.getPassword()));
        return usersRepo.save(users);
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = usersRepo.getUserByUsername(username);
        if(user == null){
            throw  new UsernameNotFoundException("User does not exist");
        }
        return new MyUserDetails(user);
    }
}