package com.example.forumapp.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
    public class Post {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String content;

        @ManyToOne
        private User user;

        @OneToMany(mappedBy = "post")
        private List<Comment> comments;

        // Getters and Setters
    }
