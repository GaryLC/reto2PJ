package com.bootcamp.gestionBlogs.blogs.services;

import com.bootcamp.gestionBlogs.blogs.entities.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    String saveBlog(Blog blog);
}
