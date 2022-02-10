package com.bootcamp.gestionBlogs.blogs.services;

import com.bootcamp.gestionBlogs.blogs.entities.Author;
import com.bootcamp.gestionBlogs.blogs.entities.Post;

import java.util.List;

public interface PostService {

    List<Post> findAll();
    String save(Post post);
}
