package com.example.forumapp.controller;



import com.example.forumapp.model.Post;
import com.example.forumapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

    @Controller
    public class PostController {
        @Autowired
        private PostService postService;

        @GetMapping("/posts")
        public String getAllPosts(Model model) {
            model.addAttribute("posts", postService.findAllPosts());
            return "posts";
        }

        @GetMapping("/posts/new")
        public String newPostForm(Model model) {
            model.addAttribute("post", new Post());
            return "new_post";
        }

        @PostMapping("/posts")
        public String savePost(Post post) {
            postService.savePost(post);
            return "redirect:/posts";
        }
    }


