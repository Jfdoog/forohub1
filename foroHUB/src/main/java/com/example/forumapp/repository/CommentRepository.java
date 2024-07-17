package com.example.forumapp.repository;

import com.example.forumapp.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository  extends JpaRepository<Comment,Long> {
}
