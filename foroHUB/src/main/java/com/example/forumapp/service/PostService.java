

    package com.example.forumapp.service;

import com.example.forumapp.model.Post;
import com.example.forumapp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class PostService {
        @Autowired
        private PostRepository postRepository;

        public List<Post> findAllPosts() {
            return postRepository.findAll();
        }

        public Post savePost(Post post) {
            return postRepository.save(post);
        }
    }


