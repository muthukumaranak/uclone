package com.app.youtubeclone.repository;


import com.app.youtubeclone.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {
    @Query("SELECT u FROM Users u WHERE u.name = :username")
    public Users getUserByUsername(@RequestParam("username") String username);

}
