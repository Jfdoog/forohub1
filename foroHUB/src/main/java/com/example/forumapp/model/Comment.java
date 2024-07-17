package com.example.forumapp.model;

import jakarta.persistence.*;

@Entity
    public class Comment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String content;

        @ManyToOne
        private Post post;

        @ManyToOne
        private User user;

        // Getters and Setters
    }
