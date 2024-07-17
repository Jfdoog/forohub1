
    package com.example.forumapp.repository;

import com.example.forumapp.model.User;
import com.example.forumapp.model.Post;
import com.example.forumapp.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface UserRepository extends JpaRepository<User, Long> {}


